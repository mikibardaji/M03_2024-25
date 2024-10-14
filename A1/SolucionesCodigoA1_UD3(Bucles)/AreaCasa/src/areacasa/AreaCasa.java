/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacasa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AreaCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area_casa=0,largo,ancho,area_habitacion;
        char mas;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Largo habitacion");
            largo = sc.nextDouble();
            System.out.println("Ancho habitacion");
            ancho = sc.nextDouble();
            area_habitacion = largo*ancho;
            area_casa += area_habitacion; //area_casa = area_casa + area_habitacion
            System.out.println("Hay mas habtaciones (s/n)");
            mas = sc.next().charAt(0);
        }while(mas!='n' && mas!='N');
        
        System.out.println("Tu casa mide " + area_casa);
        
        
        
        
    }
    
}
