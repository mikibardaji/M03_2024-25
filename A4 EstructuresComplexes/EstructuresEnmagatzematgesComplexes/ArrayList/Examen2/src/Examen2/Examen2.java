/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import Objectes.NotUserInformedException;
import Objectes.BibliotecaDAO;
import Objectes.*;
import Vista.Menu;
import Vista.OptionDuplicateException;
import Vista.BookView;
import java.util.List;

/**
 *
 * @author usuari
 */
public class Examen2 {


public static void main(String[] args) {
        Examen2 app = new Examen2();
        app.run();
    }

    /*�l que llan�a la aplicacio */
    private void run() {
 
            int opcion_menu;
            //Clase Modelo
            BibliotecaDAO coleccion = new BibliotecaDAO();
            //clase vista
            //ESTA PARTE AHORA MISMO
            //NO HARIA FALTA, SE PUEDE PONER LOS ESCANNERES Y EL SYSTEM.OUT.PRINTLN
            //EN LA MISMA
            BookView vista = new BookView();
            Menu men = new Menu("Men� Biblioteca", true);
            
            anyadirOpciones(men);
            
            do{
                men.displayMenu();
                opcion_menu = men.chooseOption();
                if (opcion_menu==1)
                {   try {
                    //pedir datos y a�adir video
                    Llibre add = vista.newVideo(); //quiero todos los datos del video
                    coleccion.afegirVideo(add);
                    vista.mostrarMensaje("A�adido video " + add);
                    } catch (NotUserInformedException ex) {
                        vista.mostrarMensaje("vistaha saltado la excepcion" + ex.getMessage());
                    }
                }
                else if (opcion_menu == 2)
                {
                    Llibre delete = vista.newVideo();
                    if (coleccion.eliminarVideo(delete))
                    {
                        vista.mostrarMensaje("Borrado " + delete.getTitol() + "del usuario " 
                                + delete.getUsuari());
                    }
                    else
                    {
                        vista.mostrarMensaje("No se ha encontrado " + delete.getTitol() + "del usuario " 
                                + delete.getUsuari());
                    }

                }
                else if (opcion_menu == 3)
                {
                    String usuari = vista.pedirAutor();
                    List<Llibre> listaTotal = coleccion.llistarVideosUsuariPopulars(usuari);
                    vista.mostrarMensaje("Lista videos mas populares" + usuari);
                    vista.listado(listaTotal);
                }
                else if (opcion_menu == 4)
                {
                    String usuari = vista.pedirAutor();
                    List<Llibre> listaTotal = coleccion.llistarVideosUsuariTitol(usuari);
                    vista.mostrarMensaje("Lista videos Titulo" + usuari);
                    vista.listadoGet(listaTotal); //diferents
                }             
                else if (opcion_menu == 5)
                {//Listar Album
                    String usuari = vista.pedirAutor();
                    List<Llibre> listaTotal = coleccion.llistarVideosDurada(usuari);
                    vista.mostrarMensaje("Lista videos duracion" + usuari);
                    vista.listadoIterator(listaTotal); //diferent maneres
                }
            }while (opcion_menu!=0);
            

    }

    private void anyadirOpciones(Menu men) {
        try {
            men.addOption("Afegir Video");
            men.addOption("Eliminar Video");
            men.addOption("Videos mes populars Usuari");
            men.addOption("Videos titol");
            men.addOption("Ordenaci� duraci� Usuari");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
