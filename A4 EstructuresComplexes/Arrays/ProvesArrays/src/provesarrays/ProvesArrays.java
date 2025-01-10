/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProvesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[] notas_alumnnos;
       notas_alumnnos = new double[3];
       notas_alumnnos[0]= 2.25;
       notas_alumnnos[1]= 5.25;
       Scanner sc = new Scanner(System.in);
       Random rd = new Random();
       for(int alu=0;alu<notas_alumnnos.length;alu++)
       {
          // System.out.println("Nota para el alumno " + (alu+1));
          // double nota = sc.nextDouble();
           notas_alumnnos[alu] = rd.nextDouble(1, 10.01);
       }
        
        for (int indice = 0; indice < notas_alumnnos.length; indice++) {
            //System.out.println("El alumno " + (indice+1) + " ha sacado " + notas_alumnnos[indice]);
            System.out.printf("El alumno %d ha sacado %5.2f \n",(indice+1),notas_alumnnos[indice]);
        }
        
        System.out.println("De que alumno quieres saber la nota");
        int alumno = sc.nextInt();
        System.out.printf("El alumno %d ha sacado %5.2f \n",(alumno),notas_alumnnos[alumno-1]);
        //System.out.println("El alumno " + alumno + " ha sacado " + notas_alumnnos[alumno-1]);
        double notas_acum=0;
        for (int alumne = 0; alumne < notas_alumnnos.length; alumne++) {
            notas_acum = notas_alumnnos[alumne] + notas_acum;   
        }
        
        System.out.println("nota acumulada " + notas_acum);
        double media = notas_acum/notas_alumnnos.length;
        System.out.println("Media de la clase " + media);
        //hacer un bucle DONE
        //sumar cada nota en una variable acumuladora
        
        //al final dividir por el numeor de alumnos
        
        //mostrar la media
        
    }
    
}
