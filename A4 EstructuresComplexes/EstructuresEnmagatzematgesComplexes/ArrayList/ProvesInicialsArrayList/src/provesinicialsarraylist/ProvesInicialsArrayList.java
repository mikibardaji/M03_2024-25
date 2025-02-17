/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesinicialsarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class ProvesInicialsArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        //List<int> datosInt = new ArrayList<>();
        List<Integer> datos = new ArrayList<>();
        //clase integer ja te implementat el equals
        Integer num = 35; //new Integer
        
        //afegir objectes
        datos.add(num);
        datos.add(Integer.valueOf(12));
        datos.add(Integer.valueOf(112));
        datos.add(Integer.valueOf(42));
        
        //saber la quantitat d'bjectes qe te
        System.out.println("Numero d'elements: " + datos.size());
        //metodes per recorrer la estructures dades
        //foreach
        
        for (Integer numero : datos) { //es que no saps el index/posicio
            System.out.println(numero); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        datos.add(Integer.valueOf(1000));
        System.out.println("metode get");
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i)); 
        }
        
        
        //Iterador PERQUE ES UNA MANERA MES RAPIDA DE RECORRER ARRAY
        //L'inconvenient es que sol no pots tirar endarrera
        System.out.println("Recorrer amb iterador");
        Iterator<Integer> iter = datos.iterator();
        while (iter.hasNext()) //true si hi ha un element endavant
        {
            Integer element = iter.next();
            System.out.println(element);
        }
        
        //contains funciona perque la clase de datos 
        //que conte aquest arraylist te implementat el Equals
        if (datos.contains(112))
        {
            System.out.println("Existe el numero 112");
        }
        else
        {
            System.out.println("No existe el 112");
        }
        if (datos.contains(400))
        {
            System.out.println("Existe el numero 400");
        }
        else
        {
            System.out.println("No existe el 400");
        }                
        
        //borrar també gracies al equals
        datos.remove(Integer.valueOf(112));
        datos.remove(0); //el primer de la llista
        System.out.println("Borro el 112");
        for (Integer numero : datos) { //es que no saps el index/posicio
            System.out.println(numero); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        //afegir per index
        datos.add(2, 500);
        System.out.println("He afegit 500 a la posicio 2");
        for (Integer numero : datos) { //es que no saps el index/posicio
            System.out.println(numero); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        datos.set(2, 600);
        System.out.println("He canviat a 600 a la posicio 2");
        for (Integer numero : datos) { //es que no saps el index/posicio
            System.out.println(numero); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        
        System.out.println("el 600 es troba a " + datos.indexOf(600));
        
        System.out.println(datos.toString());
        System.out.println(datos);
    }
    
}
