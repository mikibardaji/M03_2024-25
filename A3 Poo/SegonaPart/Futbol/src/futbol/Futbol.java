/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futbol;

import java.util.Scanner;
import Objetos.*;
/**
 *
 * @author mabardaji
 */
public class Futbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        EquipoFutbol persona=null;

        Futbolista p1 = new Futbolista(1, "Messi");
        Futbolista p2 = new Futbolista(3, "Messi");
        Futbolista p3 = new Futbolista(1, "CR7");
        
        
        
        if (p1.equals(p2))
        {
            System.out.println("Son iguales p1 y p2");
        }
        else
        {
            System.out.println("No son iguales p1 y p2");
        }
        if (p1.equals(p3))
        {
            System.out.println("Son iguales p1 y p3");
        }
        else
        {
            System.out.println("No tienen comparacion ");
        }
        System.exit(0);
        
        while (continuar) {
            System.out.println("Quin tipus del equip de futbol vols crear? (JUGADOR/ENTRENADOR/MASSATGISTA/PRESIDENT):");
            String tipus = scanner.nextLine().toUpperCase();
            

            switch (tipus) {
                case "JUGADOR":
                    persona = crearFutbolista();
                    break;
                case "ENTRENADOR":
                    persona = crearEntrenador();
                    break;

                case "MASSATGISTA":
                    System.out.print("Introdueix l'ID: ");
                    int idM = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    System.out.print("Introdueix el nom: ");
                    String nomM = scanner.nextLine();
                    System.out.print("Introdueix l'edat: ");
                    int edatM = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    System.out.print("Introdueix la titulació acadèmica: ");
                    String titulacio = scanner.nextLine();
                    persona = new Masajista(idM, nomM, edatM, titulacio);
                    break;

                case "PRESIDENT":
                    System.out.print("Introdueix l'ID: ");
                    int idP = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    System.out.print("Introdueix el nom: ");
                    String nomP = scanner.nextLine();
                    System.out.print("Introdueix l'edat: ");
                    int edatP = scanner.nextInt();
                    System.out.print("Introdueix els anys en el càrrec: ");
                    int anysCarrec = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    persona = new President(idP, nomP, edatP, anysCarrec);
                    break;

                default:
                    System.out.println("Tipus no reconegut.");
                    break;
            }

            if (persona != null) {
                
                persona.saludar();
                persona.concentrarse();
                persona.viajar();
                persona.diaPartido();

                if (persona instanceof Futbolista) {
                    ((Futbolista) persona).entrenar();
                } else if (persona instanceof Entrenador) {
                    ((Entrenador) persona).entrenar();
                } else if (persona instanceof Masajista) {
                    ((Masajista) persona).darMasaje();
                } else if (persona instanceof President) {
                    Futbolista fut = new Futbolista(12, "Messi");
                    ((President) persona).tratarContrato(fut);
                }
            }

            System.out.print("Vols crear un altre objecte? (si/no): ");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("si");
        }

        //scanner.close();
        System.out.println("Programa acabat.");
    }

    private static Futbolista crearFutbolista() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Introdueix l'ID: ");
                    int idJ = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    System.out.print("Introdueix el nom: ");
                    String nomJ = scanner.nextLine();
                    System.out.print("Introdueix l'edat: ");
                    int edatJ = scanner.nextInt();
                    System.out.print("Introdueix els gols: ");
                    int gols = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    return new Futbolista(idJ, nomJ, edatJ, gols);
    }

    private static Entrenador crearEntrenador() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Introdueix l'ID: ");
                    int idE = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    System.out.print("Introdueix el nom: ");
                    String nomE = scanner.nextLine();
                    System.out.print("Introdueix l'edat: ");
                    int edatE = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salt de línia
                    return new Entrenador(idE, nomE, edatE);
    }
}
