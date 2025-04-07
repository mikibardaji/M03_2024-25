/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.List;
import java.util.Scanner;
import model.Entrenador;

public class VistaConsola {

    private Scanner scanner;

    public VistaConsola() {
        scanner = new Scanner(System.in);
    }

    // Mètode per demanar el nom d'usuari i contrasenya
    public Entrenador demanarCredencials() {
        System.out.print("Introdueix el teu nom d'usuari: ");
        String username = scanner.nextLine();

        System.out.print("Introdueix la teva contrasenya: ");
        String password = scanner.nextLine();

        // Retornem un objecte Entrenador amb les dades introduïdes
        return new Entrenador(username, password);
    }

    // Mètode per mostrar un missatge quan l'usuari s'ha registrat
    public void mostrarMissatgeRegistrat(String username) {
        System.out.println("Benvingut, " + username + "! Has estat registrat amb èxit.");
    }

    // Mètode per mostrar un missatge d'error en cas de contrasenya incorrecta
    public void mostrarMissatgeContrasenyaIncorrecta() {
        System.out.println("Contrasenya incorrecta. El programa s'acabarà.");
    }

    // Mètode per mostrar el menú principal
    public void mostrarMenu() {
        System.out.println("\nEscull una opció:");
        System.out.println("0.- Sortir");
        System.out.println("1.- Donar-se d'alta com a entrenador");
        System.out.println("2.- Donar-se de baixa com a entrenador");
        System.out.println("3.- Consultar dades d'entrenador");
        System.out.println("4.- Llistar entrenadors");
        System.out.println("5.- Donar d'alta Pokémon");
        System.out.println("6.- Cazar Pokémon");
        System.out.println("7.- Llistar Pokémons capturats");
        System.out.println("8.- Llistar tipus de Pokémon");
    }

    // Mètode per mostrar missatges generals
    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

    // Mètode per demanar la selecció del menú
    public int demanarOpcioMenu() {
        System.out.print("Selecciona una opció: ");
        return scanner.nextInt();
    }

    public String demanarNomEntrenador() {
        System.out.print("Introdueix el nom de l'entrenador per donar-se de baixa: ");
        return scanner.nextLine();
    }


}

