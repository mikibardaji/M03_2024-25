/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Persona;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Ara mateix no seria necessari aquesta opció, es podria fer tot al main.
 * @author usuari
 */
public class BibliotecaView {
    Scanner sc = new Scanner(System.in);
    
    public Persona DatosPersona()
    {
        String DNI,nombre;

        
        System.out.print("Dime DNI de usuario: ");
        DNI = sc.nextLine();

        System.out.print("Dime nombre de usuario: ");
        nombre = sc.nextLine();
            
        Persona add = new Persona(DNI, nombre);
        return add;
    }
    
     public String DatosTitulo()
    {
        String titulo;

        System.out.print("Dime titulo del libro: ");
        titulo = sc.nextLine();
        return titulo;
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
/*
    public void listado(List<VideoTikTok> listaTotal) {
//        for (VideoTikTok video : listaTotal) {
//            System.out.print(video); 
//        }
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
    }*/

    public String pedirDNI() {
         String DNI,nombre;

        
        System.out.print("Dime DNI de usuario: ");
        DNI = sc.nextLine();
        return DNI;
    }

    public void ListarLibros(Set<String> Libros) {
        for (String titulo : Libros) {
            System.out.println(titulo);
        }
        System.out.println("Libros mostrados: " + Libros.size());
        
    }
}
