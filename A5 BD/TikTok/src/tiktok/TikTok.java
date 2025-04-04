/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktok;

import Objectes.DBConnect;
import Objectes.Like;
import Objectes.LikeDAO;
import Objectes.TikTokDAODB;
import Objectes.VideoTikTok;
import Objectes.Visualitzador;
import Objectes.VisualitzadorDAO;
import Vista.Menu;
import Vista.OptionDuplicateException;
import Vista.VideoTikTokView;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuari
 */
public class TikTok {


public static void main(String[] args) {
        TikTok app = new TikTok();
        app.run();
    }

    /*Êl que llança la aplicacio */
    private void run() {
 
    try {
        int opcion_menu;
        //al principi del programa i un sol cop!!
        DBConnect.loadDriver();
        //Clase Modelo
        TikTokDAODB coleccion = new TikTokDAODB();
        VisualitzadorDAO colVisualitzador = new VisualitzadorDAO();
        LikeDAO LikeDB = new LikeDAO();
        //clase vista
        //ESTA PARTE AHORA MISMO
        //NO HARIA FALTA, SE PUEDE PONER LOS ESCANNERES Y EL SYSTEM.OUT.PRINTLN
        //EN LA MISMA
        VideoTikTokView vista = new VideoTikTokView();
        Menu men = new Menu("Menú Tiktok", true);
        
        anyadirOpciones(men);
        
        do{
            men.displayMenu();
            opcion_menu = men.chooseOption();
            switch (opcion_menu) {
                case 1:
                    try {
                        //pedir datos y añadir video
                        VideoTikTok add = vista.newVideo(); //quiero todos los datos del video
                        coleccion.afegirVideo(add);
                        vista.mostrarMensaje("Añadido video " + add);
                    } catch (SQLException ex) {
                        vista.mostrarMensaje("vistaha saltado la excepcion" + ex.getMessage());
                }
                        break;

                case 2:
                    try {
                        VideoTikTok delete = vista.newVideo();
                        int deletes = coleccion.eliminarVideo(delete);
                        if (deletes>0 )
                        {
                            vista.mostrarMensaje("Borrado " + delete.getTitol() + "del usuario "
                                    + delete.getUsuari() + " habia " + deletes + " videos ");
                        }
                        else
                        {
                            vista.mostrarMensaje("No se ha encontrado " + delete.getTitol() + "del usuario "
                                    + delete.getUsuari());
                        }   
                    } catch (SQLException ex) {
                        vista.mostrarMensaje("vistaha saltado la excepcion" + ex.getMessage());
                    }
                    
                    break;
                case 3:
                {
                    try{
                    String usuari = vista.pedirUsuario();
                    List<VideoTikTok> listaTotal = coleccion.llistarVideosUsuariPopulars(usuari);
                    vista.mostrarMensaje("Lista videos mas populares" + usuari);
                    vista.listado(listaTotal);
                    } catch (SQLException ex) {
                        vista.mostrarMensaje("vista ha saltado la excepcion" + ex.getMessage());
                    }
                    break;
                }
                case 4:
                {
                    String usuari = vista.pedirUsuario();
                    List<VideoTikTok> listaTotal = coleccion.llistarVideosUsuariTitol(usuari);
                    vista.mostrarMensaje("Lista videos Titulo" + usuari);
                    vista.listadoGet(listaTotal); //diferents
                    break;
                }
                case 5:
                {
                    //Listar Album
                    String usuari = vista.pedirUsuario();
                    List<VideoTikTok> listaTotal = coleccion.llistarVideosDurada(usuari);
                    vista.mostrarMensaje("Lista videos duracion" + usuari);
                    vista.listadoIterator(listaTotal); //diferent maneres
                    break;
                }
                case 6:
                {
                    //Alta visualitzador
                    Visualitzador viewer = vista.pedirVisualizador();
                    if (colVisualitzador.afegirVisualitzador(viewer))
                    {
                        vista.mostrarMensaje("afegit " + viewer);
                    }
                    else
                    {
                        vista.mostrarMensaje("No afegit ");
                    }
                    
                    break;
                }
                case 7:
                {
                    //Alta visualitzador
                    Like meGusta = vista.datosLike();
                    if ((LikeDB.afegirLike(meGusta)))
                    {
                        vista.mostrarMensaje("afegit " + meGusta);
                    }
                    else
                    {
                        vista.mostrarMensaje("No afegit ");
                    }
                    
                    break;
                }                 
                default:
                    break;
            }
        }while (opcion_menu!=0);
    } catch (ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
    } catch (SQLException ex) {
        Logger.getLogger(TikTok.class.getName()).log(Level.SEVERE, null, ex);
    }
            

    }

    private void anyadirOpciones(Menu men) {
        try {
            men.addOption("Afegir Video");
            men.addOption("Eliminar Video");
            men.addOption("Videos mes populars Usuari");
            men.addOption("Videos titol");
            men.addOption("Ordenació duració Usuari");
            men.addOption("Afegir Visualitzador");
            men.addOption("Donar like");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
