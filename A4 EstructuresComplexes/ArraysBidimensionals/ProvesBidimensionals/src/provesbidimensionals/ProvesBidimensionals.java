/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesbidimensionals;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProvesBidimensionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ALUMNOS = 3;
        final int ASIGNATURAS = 4;
        int[][] notas_alumnos = new int[ALUMNOS][ASIGNATURAS];
        
        //introduir notes per cada alumne
        
        introducirNotasAlumno(notas_alumnos);
        mostrarNotas(notas_alumnos);
        encontrarEstadisticas(notas_alumnos);
        
        
        
    }

    private static void introducirNotasAlumno(int[][] notas_alumnos) {
        Scanner sc = new Scanner(System.in);
        for (int alumne = 0; alumne < notas_alumnos.length; alumne++) { 
            //notas_alumnos.length = filas en aquest cas es igual a ALUMNOS
            for (int asignatura_colum = 0; asignatura_colum < notas_alumnos[alumne].length; asignatura_colum++) {
                //a Java seria igual ficar notas_alumnos[alumne].length que ficar notas_alumnos[0].length
                System.out.println("Pon la nota " + (asignatura_colum+1) + 
                        " para el alumno " + (alumne+1));
                notas_alumnos[alumne][asignatura_colum] = sc.nextInt();
            }
            
        }
    }

    
    /**
     * Mostrarme el numero del alumno (+1) y mostrarme las notas que ha sacado
     * @param notas_alumnos 
     */
    private static void mostrarNotas(int[][] notas_alumnos) {
        for (int fila = 0; fila < notas_alumnos.length; fila++) { //alumnos
            System.out.print("Alumno " + (fila+1) + "=> ");
            for (int columna = 0; columna < notas_alumnos[fila].length; columna++) { //notas
                System.out.print(notas_alumnos[fila][columna]+",");
            }
            System.out.println("");
        }
    }

    /**
     * tengo que buscar la nota minima
     * la nota maxima
     * la media por cada alumnos
     * @param notas_alumnos 
     */
    private static void encontrarEstadisticas(int[][] notas_alumnos) {
        int minima;
        int maxima;
        double media;
        //int total_notas;
        for (int fila = 0; fila < notas_alumnos.length; fila++) { //alumnos
            minima = notas_alumnos[fila][0];
            maxima = notas_alumnos[fila][0];
            media=0;
            for (int columna = 0; columna < notas_alumnos[fila].length; columna++) { //notas
                if (notas_alumnos[fila][columna]<minima)
                {
                    minima = notas_alumnos[fila][columna];
                }
                if (notas_alumnos[fila][columna]>maxima)
                {
                    maxima = notas_alumnos[fila][columna];
                }
                media = media + notas_alumnos[fila][columna];
            }
            media =  media /notas_alumnos[fila].length;
            System.out.println("MEdia alumno " + (fila+1) + "= " + media);
            System.out.println("Minima-> " + minima);
            System.out.println("Maxima-> " + maxima);
        }
        
        
        
        
    }
    
}
