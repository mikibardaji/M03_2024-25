/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesinicialscoches;

import Objectes.Coche;
import Objectes.SortByAnysCoche;
import Objectes.SortByMarcaCoche;
import Objectes.SortByMatricula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class ProvesInicialsCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<Coche> datos = new ArrayList<>();
        //clase integer ja te implementat el equals
        Coche car = new Coche("Renault", 1);
        
        //afegir objectes
        datos.add(car);
        datos.add(new Coche("Audi", 2));
        datos.add(new Coche("Audi", 3));
        datos.add(new Coche("Ferrari", 4));
        datos.add(new Coche("Ferrari", 2));
        
        //saber la quantitat d'bjectes qe te
        System.out.println("Numero d'elements: " + datos.size());
        
        for (Coche car2 : datos) {
            System.out.println(car2);
        }
        datos.add(new Coche("Porsche",12));
        
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i)); 
        }
        
        Coche buscar = new Coche("Porsche",12); 
        if(datos.contains(buscar)) //ho trobava 
        {
            System.out.println("Existe en tu lista");
        }
        else
        {
            System.out.println("No existe en tu lista");
        }
        
        
        if(datos.contains(new Coche("Opel", 3)))
        {
            System.out.println("Existe en tu lista");
        }
        else
        {
            System.out.println("No existe en tu lista");
        }
        
        datos.remove(0); //el primer de la llista
        //  datos.add(new Coche("Ferrari", 4));
        Coche delete = new Coche(4);
       
        Coche deleted = datos.remove(datos.indexOf(delete));
        System.out.println("Borrado" + deleted);
        System.out.println("Borro el 112");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        
        datos.add(2, new Coche("Tesla", 100));
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }
        
        
        System.out.println(datos);
        
        //crida al metode Static de colletions.sort
        Collections.sort(datos); //si t� el metode compareTo implementat i l'ordena       
        System.out.println("Lista ordenada");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }        
        
        Collections.sort(datos, Collections.reverseOrder());//
        System.out.println("Lista descendiente");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        } 
        
        Collections.sort(datos, new SortByAnysCoche());
        System.out.println("Ordenacio per anys ");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        }         
        
        Collections.sort(datos, new SortByMarcaCoche());
        System.out.println("Ordenacio per Marca ");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        } 
        
        Collections.sort(datos, new SortByMatricula());
        System.out.println("Ordenacio per matricula ");
        for (Coche car2 : datos) { //es que no saps el index/posicio
            System.out.println(car2); //perque Integer te implementat el ToString
            //System.out.println(numero.toString());
        } 
    }
    
}
