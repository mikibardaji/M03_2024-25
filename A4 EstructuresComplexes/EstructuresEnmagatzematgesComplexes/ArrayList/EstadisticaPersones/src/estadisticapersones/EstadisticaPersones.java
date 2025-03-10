/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadisticapersones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class EstadisticaPersones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();
        List<Persona> persones = new ArrayList<>();
        String[] noms = {"Justin", "Jose Miguel", "Solaymane", "Daniel", "Joan", "Harpreet", "Jeremy", "Jordi Joan", "Wenfu", "David", "Elena", "Raul"};

        // Crear 10 persones amb nota i edat aleat?ries
        for (String nom : noms) {
            int nota = random.nextInt(1,11);
            int edat = random.nextInt(16,25); // Edat entre 16 i 25
            persones.add(new Persona(nom, nota, edat));
        }

        // Conjunts segons la nota
        Set<Persona> aprovats = new HashSet<>();
        Set<Persona> suspesos = new HashSet<>();

        // Conjunts segons l'edat
        Set<Persona> menorsEdat = new HashSet<>();
        Set<Persona> majorsEdat = new HashSet<>();

        for (Persona p : persones) {
            if (p.getNotaFinal() >= 5) {
                aprovats.add(p);
            } else {
                suspesos.add(p);
            }

            if (p.getEdat() < 18) {
                menorsEdat.add(p);
            } else {
                majorsEdat.add(p);
            }
        }
        
        System.out.println("MAJORS EDAT");
        for (Persona person : majorsEdat) {
            System.out.println(person);
        }
        System.out.println("MENORS EDAT");
        for (Persona person : menorsEdat) {
            System.out.println(person);
        }
        
        System.out.println("APROVATS");
        for (Persona person : aprovats) {
            System.out.println(person);
        }
        System.out.println("SUSPESOS");
        for (Persona person : suspesos) {
            System.out.println(person);
        }
        
        
        //menors edat aprovat
        Set<Persona> menorsAprovats = new HashSet<>(menorsEdat);
        menorsAprovats.retainAll(aprovats);
        System.out.println("Menores aprovados");
        for (Persona menorsAprovat : menorsAprovats) {
            System.out.println(menorsAprovat);
        }
        //otra manera de inicializar 
        Set<Persona> m1 = new HashSet<>();
        m1.addAll(menorsEdat); //añade todos por que esta vacio
        
        Set<Persona> mayores = new HashSet<>(majorsEdat);
        mayores.retainAll(suspesos);
        for (Persona mayor : mayores) {
            System.out.println(mayor);
        }
        System.out.println("menores suspendidos");
         Set<Persona> menores_suspendidos = new HashSet<>(menorsEdat);
         menores_suspendidos.removeAll(aprovats);
         for (Persona suspesos1 : menores_suspendidos) {
             System.out.println(suspesos1);
        }
        
        //utilizando los conjuntos de menors y solo el de aprovados
        //encontrar los que no han aprovado (y que sean menores) 
        
        
    }
    
}
