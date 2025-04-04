/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Objectes.Like;
import Objectes.VideoTikTok;
import Objectes.Visualitzador;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Ara mateix no seria necessari aquesta opció, es podria fer tot al main.
 * @author usuari
 */
public class VideoTikTokView {
    
    
    public VideoTikTok newVideo()
    {
        String titulo,usuario;
        int duracion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime nombre de usuario: ");
        usuario = sc.nextLine();

            System.out.print("Dime titulo video: ");
            titulo = sc.nextLine();
            System.out.print("Cuanto dura? ");
            duracion = sc.nextInt(); 
        VideoTikTok add = new VideoTikTok(usuario, titulo, duracion);
        return add;
    }
    
    public void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    
    
    public String pedirUsuario()
    {
        String usuario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime nombre de usuario: ");
        usuario = sc.nextLine();
        
        return usuario;
    }

    public void listado(List<VideoTikTok> listaTotal) {
        for (VideoTikTok video : listaTotal) {
            System.out.print(video); 
        }
        System.out.println("Listado totales: " + listaTotal.size());
    }
    
    
    public void listadoGet(List<VideoTikTok> listaTotal) {
        for (int i = 0; i < listaTotal.size(); i++) {
            System.out.println(listaTotal.get(i));
        }
        
        System.out.println("Listado totales: " + listaTotal.size());
    }
    
    public void listadoIterator(List<VideoTikTok> listaTotal) {
        
        for (Iterator<VideoTikTok> iterator = listaTotal.iterator(); iterator.hasNext();) 
        {
            System.out.println(iterator.next());
        }
    }

    public Visualitzador pedirVisualizador() {
        String nick,nom;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime nombre de usuario: ");
        nom = sc.nextLine();

        System.out.print("Dime nick visualizador: ");
        nick = sc.nextLine();

        Visualitzador add = new Visualitzador(nom, nick);
        return add;
    }

    public Like datosLike() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
