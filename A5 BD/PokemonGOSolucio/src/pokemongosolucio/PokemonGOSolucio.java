/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongosolucio;

import BD.DBConnect;
import DAO.CapturaDAO;
import DAO.EntrenadorDAO;
import DAO.PokemonDAO;
import Vista.VistaConsola;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Entrenador;
import model.Pokemon;

/**
 *
 * @author usuari
 */
public class PokemonGOSolucio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonGOSolucio app = new PokemonGOSolucio();
        app.run();
    }

    private void run() {
         VistaConsola vista = new VistaConsola();
        try {
           
            //al principi del programa i un sol cop!!
            DBConnect.loadDriver();

            // Crear instàncies de la vista i DAO
            
            try {
                //inicializo DAO
                EntrenadorDAO daoEntrenadors = new EntrenadorDAO();
                PokemonDAO daoPokemon = new PokemonDAO();
                CapturaDAO daoCaptura = new CapturaDAO();
                // Mostrar benvinguda inicial
                vista.mostrarMissatge("Benvingut al Pokémon Go Cutre-Java!");
                
                // FASE 4: Demanar credencials a l'usuari, que ara retorna un objecte Entrenador
                Entrenador entrenador_login = vista.demanarCredencials();
                
                boolean login = validaciónLogin(daoEntrenadors, vista, entrenador_login);
               
                
                if(!login)
                {
                    vista.mostrarMissatge("Login incorrecte");
                }
                else
                {
                    vista.mostrarMenu();
                    int opcio = vista.demanarOpcioMenu();
                    
                    do{
                        switch (opcio) {
                            case 0:
                                System.out.println("Sortint del programa...");
                                break;
                            case 1:
                                // Implementar donar-se d'alta com a entrenador_login
                                Entrenador entrenadorExistente = vista.demanarCredencials();
                                altaEntrenador(vista, daoEntrenadors, entrenadorExistente);
                                break;
                            case 2:
                                // Implementar donar-se de baixa com a entrenador_login
                                baixaEntrenador(vista, daoEntrenadors);
                                break;
                            case 3:
                                // Implementar consultar dades d'entrenador_login
                                //TO DO facil
                                break;
                            case 4:
                                // Implementar llistar entrenadors
                                listaEntrenadors(vista,daoEntrenadors);
                                break;
                            case 5:
                                // Alta Pokemon
                                // TO DO es com l'alta entrenador_login
                                break;
                            case 6:
                                // Capturar Pokemon
                                Pokemon pok = daoPokemon.getPokemonRandom();
                                vista.mostrarMissatge(pok.toString());
                                int CP = Pokemon.fuerzaPokemon(100);
                                vista.mostrarMissatge("Fuerza Pokemon... " + CP);
                                daoCaptura.darCaptura(entrenador_login.getId(), pok.getNumeroPokedex(), CP);
                            default:
                                vista.mostrarMissatge("Opció no vàlida.");
                                break;
                        }
                    }while(opcio!=0);
                    vista.mostrarMissatge("Sortint programa");
                }
                // Mostrar el menú i gestionar les opcions
                
            } catch (SQLException ex) {
                vista.mostrarMissatge("Error: " + ex.getMessage());
            }
        } catch (ClassNotFoundException ex) {
           vista.mostrarMissatge("Error: " + ex.getMessage());
        } 
    }

    private void baixaEntrenador(VistaConsola vista, EntrenadorDAO daoEntrenadors) {
         try {
            // Demanar el nom de l'entrenador_login que vol donar-se de baixa
                        String nomEntrenador = vista.demanarNomEntrenador(); // Nom del jugador a eliminar

                        // Comprovar si l'entrenador_login existeix
                        Entrenador entrenadorExist;
                                  entrenadorExist = daoEntrenadors.existeixEntrenador(nomEntrenador);

                        if (entrenadorExist != null) {
                            // Si l'entrenador_login existeix, procedim a eliminar-lo
                            boolean eliminat = daoEntrenadors.esborrarEntrenador(nomEntrenador);

                            if (eliminat) {
                                vista.mostrarMissatge("L'entrenador " + nomEntrenador + " ha estat eliminat correctament.");
                            } else {
                                vista.mostrarMissatge("No s'ha pogut eliminar l'entrenador " + nomEntrenador + ".");
                            }
                        } else {
                            vista.mostrarMissatge("L'entrenador " + nomEntrenador + " no existeix.");
                        }
                    } catch (SQLException e) {
                        vista.mostrarMissatge("Error al donar-se de baixa: " + e.getMessage());
                    }
    }

    private void listaEntrenadors(VistaConsola vista, EntrenadorDAO daoEntrenadors) {
        try {
                                // Obtenim la llista d'entrenadors
                                List<Entrenador> entrenadors = daoEntrenadors.totsEntrenadors();

                                // Comprovem si hi ha entrenadors a la base de dades
                                if (entrenadors.isEmpty()) {
                                    vista.mostrarMissatge("No hi ha entrenadors registrats.");
                                } else {
                                    // Llistem tots els entrenadors
                                    vista.mostrarMissatge("Llistat d'entrenadors:");
                                    for (Entrenador e : entrenadors) {
                                        vista.mostrarMissatge(e.toString()); // Utilitza el toString de la classe Entrenador per mostrar les dades
                                    }
                                    vista.mostrarMissatge("Entrenadors: " + entrenadors.size());
                                }
                            } catch (SQLException e) {
                                vista.mostrarMissatge("Error en recuperar la llista d'entrenadors: " + e.getMessage());
                            }
    }

    private void altaEntrenador(VistaConsola vista, EntrenadorDAO daoEntrenadors, Entrenador entrenadorExistente) {
                        Entrenador nouEntrenador = vista.demanarCredencials(); // Demanar les dades
                                // Comprovar si l'entrenador_login ja existeix a la base de dades
                                Entrenador entrenadorRepe;
                        try {
                                entrenadorRepe = daoEntrenadors.existeixEntrenador((nouEntrenador.getNom()));
                                if (entrenadorExistente == null) {
                                 daoEntrenadors.altaEntrenador(nouEntrenador);
                                 vista.mostrarMissatgeRegistrat(nouEntrenador.getNom());   
                                } else {
                                    vista.mostrarMissatge("El nom d'usuari ja està en ús.");
                                }
                        } catch (Exception e) {
                                        vista.mostrarMissatge("Error: " + e.getMessage());
                                    }
}

    private boolean validaciónLogin(EntrenadorDAO daoEntrenadors, VistaConsola vista, Entrenador entrenador_login) {
        try {
            boolean login=true;
            // Comprovar si l'entrenador_login ja existeix
            Entrenador entrenadorExistente = daoEntrenadors.existeixEntrenador(entrenador_login.getNom());
            
            if (entrenadorExistente == null) {
                // Si no existeix, registrar-lo
                try {
                    daoEntrenadors.altaEntrenador(entrenador_login);
                    vista.mostrarMissatgeRegistrat(entrenador_login.getNom());
                } catch (Exception e) {
                    vista.mostrarMissatge("Error: " + e.getMessage());
                }
            } else {
                // Si ja existeix, comprovar la contrasenya
                if (entrenadorExistente.getPassword().equals(entrenador_login.getPassword())) {
                    vista.mostrarMissatge("Contrasenya correcta! Benvingut de nou, " + entrenador_login.getNom() + ".");
                } else {
                    vista.mostrarMissatgeContrasenyaIncorrecta();
                    login = false;
                }
            }
            return login;
        } catch (SQLException ex) {
            vista.mostrarMissatge("error login "+ ex.getMessage()); //aqui no ho tiro cap a dalt perque ja estic al main
            return false;
        }
    }
    
    
}
