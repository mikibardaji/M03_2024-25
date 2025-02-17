/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesinicialscoches;

import Objectes.Coche;
import java.util.ArrayList;
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
        if(datos.contains(buscar))
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
    }
    
}
