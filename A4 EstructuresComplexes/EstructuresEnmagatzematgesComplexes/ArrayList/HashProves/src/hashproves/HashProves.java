/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashproves;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author mabardaji
 */
public class HashProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // diferentsEstructuresHash();
       Map<String, Double> notes_classe = new HashMap<>();
       
       //afegirem notes
       notes_classe.put("Roser", 3.5);
       notes_classe.put("Toni", 7.25);
       notes_classe.put("Sergio", 5.0);
       notes_classe.putIfAbsent("Patricia", 2.0);
       notes_classe.putIfAbsent("Sergio", 6.0);
       notes_classe.put("Toni", 9.25);
       //keySet et retona un conjut de les claus
       Set<String> nom_alumnes = notes_classe.keySet();
        for (String clau : nom_alumnes) {
            System.out.println(clau + " ha tret un " + notes_classe.get(clau)); 
        }
        System.out.println("Numero d'alumnes mostrat " + notes_classe.size());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el alumno que quieres cambiar la nota");
        String alumno = sc.nextLine();
        System.out.println("La nueva nota");
        Double nota = sc.nextDouble();
        if (notes_classe.containsKey(alumno))
        {
            //ya tiene una nota cambiarla
            System.out.println("Quieres cambiar la nota que tiene");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("SI"))
            {
                notes_classe.replace(alumno, nota);
            }
        }
        
       //values el conjunt de valors
       
        for (Double nota1 : notes_classe.values()) {
            System.out.println(nota1);
        }
        
       
    }

    private static void diferentsEstructuresHash() {
        Map<Integer, String> alumnesHM = new HashMap<>();
       alumnesHM.put(3,"Roser");
       alumnesHM.put(1,"Toni");
       alumnesHM.put(2,"Patricia");
       alumnesHM.put(4,"Sergio");
       System.out.println("Hashmap sense ordre");
        System.out.println(alumnesHM); 
        
        Map<Integer, String> alumnesLHM = new LinkedHashMap<>();
        alumnesLHM.put(3,"Roser");
        alumnesLHM.put(1,"Toni");
        alumnesLHM.put(2,"Patricia");
        alumnesLHM.put(4,"Sergio");
        System.out.println("LinkedHashMap amb ordre d'inserció");
        System.out.println(alumnesLHM); 
        
        
        Map<Integer, String> alumnesTHM = new TreeMap<>();
        alumnesTHM.put(3,"Roser");
       alumnesTHM.put(1,"Toni");
       alumnesTHM.put(2,"Patricia");
       alumnesTHM.put(4,"Sergio");
      System.out.println("TreeMap amb ordre d'inserció");
        System.out.println(alumnesTHM); 
    }
    
}
