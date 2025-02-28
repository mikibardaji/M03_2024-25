/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albumcromosmvc;

import Modelo.AlbumCromoDAO;
import Modelo.Cromo;
import Modelo.NumberOutofAlbum;
import Modelo.TipoBrawler;
import Vista.Menu;
import Vista.OptionDuplicateException;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class AlbumCromosMVC {

    /** VISTA /CONTROLADOR (Interaccion amb el usuari/informar/
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlbumCromosMVC app = new AlbumCromosMVC();
        app.run();
    }

    /*Êl que llança la aplicacio */
    private void run() {
 
            int opcion_menu;
            AlbumCromoDAO coleccion = new AlbumCromoDAO(100);
            Menu men = new Menu("Gestion Brawlers", Boolean.TRUE);
            
            anyadirOpciones(men);
            
            do{
                men.displayMenu();
                opcion_menu = men.chooseOption();
                if (opcion_menu==1)
                {//pedir datos y añadir brawler
                    //no seria este codigo sino pedirlo a usuarios
//                    coleccion.afegirCromo(new Cromo(2, "Jessie", TipoBrawler.COMUNES));
//                    System.out.println("add Jessie Cromos : " + coleccion.cromosAlbum()+ " - Rep " + coleccion.cromosRepes() );
                }
                else if (opcion_menu == 2)
                {//pedir datos y borrar brawler
                    //no seria este codigo porque tiene que ponerlo el usuario
//                    Cromo delete = new Cromo(1, "nom", TipoBrawler.EPICO); //atributos no importantes
//            coleccion.eliminarCromo(delete);
//            System.out.println("add Primo2 Cromos : " + coleccion.cromosAlbum()+ " - Rep " + coleccion.cromosRepes());
                }
                else if (opcion_menu == 3)
                {//pedir datos y hacer cambio
//                   Cromo consigo = new Cromo(4,"Spike", TipoBrawler.MITICOS);
//            Cromo doy = new Cromo(1, "El primo", TipoBrawler.EPICO);
//            coleccion.CambiarPatio(consigo, doy);
//            System.out.println("Cambio Cromos : " + coleccion.cromosAlbum()+ " - Rep " + coleccion.cromosRepes()); 
                }
                else if (opcion_menu == 5)
                {//Listar Album
                    List<Cromo> album = coleccion.getAlbum();
                    for (Cromo card : album) {
                        System.out.println(card);
                    }
                    System.out.println("Numero de cromos en el album: " + coleccion.getAlbum());
                }
            }while (opcion_menu!=0);
            

    }

    private void anyadirOpciones(Menu men) {
        try {
            men.addOption("Añadir Cromo");
            men.addOption("Borrar Cromo");
            men.addOption("Cambiar cromo patio");
            men.addOption("Cambiar atributos Cromo");
            men.addOption("Listar album");
            men.addOption("Listar repes");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Execució del programa sense Statics
     */

    
    
    
    
    
}
