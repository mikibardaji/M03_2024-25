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

    // M?¨tode per demanar el nom d'usuari i contrasenya
    public Entrenador demanarCredencials() {
        System.out.print("Introdueix el teu nom d'usuari: ");
        String username = scanner.nextLine();

        System.out.print("Introdueix la teva contrasenya: ");
        String password = scanner.nextLine();

        // Retornem un objecte Entrenador amb les dades introdu?¯des
        return new Entrenador(username, password);
    }

    // M?¨tode per mostrar un missatge quan l'usuari s'ha registrat
    public void mostrarMissatgeRegistrat(String username) {
        System.out.println("Benvingut, " + username + "! Has estat registrat amb ?¨xit.");
    }

    // M?¨tode per mostrar un missatge d'error en cas de contrasenya incorrecta
    public void mostrarMissatgeContrasenyaIncorrecta() {
        System.out.println("Contrasenya incorrecta. El programa s'acabar? .");
    }

//    // M?¨tode per mostrar el men?º principal
//    public void mostrarMenu() {
//        System.out.println("\nEscull una opci?³:");
//        System.out.println("0.- Sortir");
//        System.out.println("1.- Donar-se d'alta com a entrenador");
//        System.out.println("2.- Donar-se de baixa com a entrenador");
//        System.out.println("3.- Consultar dades d'entrenador");
//        System.out.println("4.- Llistar entrenadors");
//        System.out.println("5.- Donar d'alta Pok?©mon");
//        System.out.println("6.- Cazar Pok?©mon");
//        System.out.println("7.- Llistar Pok?©mons capturats");
//        System.out.println("8.- Llistar tipus de Pok?©mon");
//    }

    // M?¨tode per mostrar missatges generals
    public void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

    // M?¨tode per demanar la selecci?³ del men?º
    public int demanarOpcioMenu() {
        System.out.print("Selecciona una opcio: ");
        return scanner.nextInt();
    }

    public String demanarNomEntrenador() {
        System.out.print("Introdueix el nom de l'entrenador per donar-se de baixa: ");
        return scanner.nextLine();
    }

    public int datosAtaque(int max) {
        System.out.print("Quin numero et permetra captura el pokemon? (1-" + max);
        return scanner.nextInt();
    }


}

