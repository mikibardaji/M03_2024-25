/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Objectes.InvalidLengthFieldException;
import Objectes.Llibre;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Ara mateix no seria necessari aquesta opció, es podria fer tot al main.
 * @author usuari
 */
public class BookView {
    
    
    public Llibre newVideo() throws InvalidLengthFieldException
    {
        String titulo,autor;
        double satisfy;
        int pag;
        Scanner sc = new Scanner(System.in);


            System.out.print("Dime titulo Libro: ");
            titulo = sc.nextLine();
            System.out.print("Dime autor Libro: ");
            autor  = sc.nextLine();
            System.out.print("Satisfacition? ");
            satisfy = sc.nextDouble(); 
            System.out.print("Paginas? ");
            pag = sc.nextInt(); 
            System.out.print("Genero? ");
            String genero = sc.nextLine(); 
        Llibre add = new Llibre(titulo,autor,satisfy,pag, genero);
        return add;
    }
    
    public void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    
    
    public String pedirAutor()
    {
        String usuario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime nombre de autor: ");
        usuario = sc.nextLine();
        
        return usuario;
    }

    public void listado(List<Llibre> listaTotal) {
        for (Llibre book : listaTotal) {
            System.out.print(book); 
        }
        System.out.println("Listado totales: " + listaTotal.size());
    }
    
    
    public void listadoGet(List<Llibre> listaTotal) {
        for (int i = 0; i < listaTotal.size(); i++) {
            System.out.println(listaTotal.get(i));
        }
        
        System.out.println("Listado totales: " + listaTotal.size());
    }
    
    public void listadoIterator(List<Llibre> listaTotal) {
        
        for (Iterator<Llibre> iterator = listaTotal.iterator(); iterator.hasNext();) 
        {
            System.out.println(iterator.next());
        }
    }
}
