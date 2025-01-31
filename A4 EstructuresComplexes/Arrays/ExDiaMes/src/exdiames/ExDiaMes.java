/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exdiames;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExDiaMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays amb els noms dels mesos i els dies corresponents
        String[] mesos = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dies = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Demanar el nom del mes a l'usuari
        System.out.print("Introduce el nombre del mes: ");
        String mesUsuari = scanner.nextLine();
        boolean trobat = false;
        int index = 0;
        while (!trobat && index<mesos.length) //si el recorro tot sempre FOR sino un while o do---whike
        {
            if (mesos[index].equalsIgnoreCase(mesUsuari))
            {
                trobat =true;
            }
            else //important si al sortir necesito la posiciói
            {
                index++;
            }  
        }
        
        if (trobat)
        {
            System.out.println("El mes " + mesos[index] + " tienen " + dies[index] + " dias");
        }
        else
        {
            System.out.println("No existe el mes " + mesUsuari);
        }
        
        
        
        
    }
    
}
