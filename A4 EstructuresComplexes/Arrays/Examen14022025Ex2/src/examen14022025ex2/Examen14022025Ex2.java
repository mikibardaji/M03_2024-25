/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen14022025ex2;

import java.util.Scanner;

/**
Se'ns demana que generem una contrasenya una mica m�s segura, i que depengui del nom i el DNI de l'usuari. La
contrasenya consistir� en el nom de l'usuari, les dues primeres lletres del cognom i els darrers 4 d�gits del DNI (sense
comptar la lletra). Per exemple, Marta L�pez amb DNI 24920509K tindr� la contrasenya Martalo0509. Fixa't que nom�s
la primera lletra est� en maj�scules. I sempre t� que estar la primera amb maj�scula, i tota la resta amb min�scules.
Utilitza sempre que sigui possible funcions associades a String.
-Crea una funci� que canviant tan sols la frase d�entrada com String, serveixi per demanar el nom, cognom i
DNI.(0,5pt)
-Crea una funci� que rebi el nom, el cognom i el DNI com a par�metre i que torni un string amb la contrasenya
formada. (2,25 pts)
 */
public class Examen14022025Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom = demanarInput("Introdueix el teu nom: ");
        String cognom = demanarInput("Introdueix el teu cognom: ");
        String dni = demanarInput("Introdueix el teu DNI (sense lletra): ");
        
        // Generar la contrasenya
        String nom_contrasenya = generarNom(nom);
        String cognom_contrasenya = generarCognom(cognom);
        String dni_contrasenya = generarDNI( dni);
        String pw_ok = nom_contrasenya + cognom_contrasenya+dni_contrasenya;
        System.out.println("La teva contrasenya generada �s: " + pw_ok);
        
        
    }
    
    // Funci� per demanar un input a l'usuari
    public static String demanarInput(String missatge) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(missatge);
        return scanner.nextLine();
    }
    
    public static String generarNom(String nom)
    {
        String majuscula = nom.substring(0, 1).toUpperCase(); 
        String minuscula =  nom.substring(1).toLowerCase();
        System.out.println(majuscula+minuscula);
        return majuscula + minuscula;
    }

    public static String generarCognom(String cognom)
    {
        String cognom_retallat = cognom.substring(0, 2); 
        String cognom_ok =  cognom_retallat.toLowerCase();
        return cognom_ok;
    }    
    
   public static String generarDNI(String DNI)
    {
        String DNI_senseLletra = DNI.substring(0, 8); //sol els digits
        String ultims_digits =  DNI_senseLletra.substring(4);//la 5ena opsicion que es el 4
        return ultims_digits;
    }
    
}
