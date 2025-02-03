/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1bidimensional;

/**

 * @author mabardaji
 */
public class Ex1Bidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int[][] valores = inicializarValores();
        // inicializarValores(valores);
        mostrarValores(valores);
    }

    //private static void inicializarValores(int[][] valores) {
    private static int[][] inicializarValores() {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        int[][] valores = new int[FILAS][COLUMNAS];
        int cont=1;
        for (int fila = 0; fila <valores.length; fila++) {
            for (int colum = 0; colum < valores[fila].length; colum++) {
                valores[fila][colum] = cont; 
                cont++;
            }
        }
        return valores;
    }

    private static void mostrarValores(int[][] valores) {
        for (int fila = 0; fila <valores.length; fila++) {
            for (int colum = 0; colum < valores[fila].length; colum++) {
                System.out.format("%02d ",valores[fila][colum]);
                //System.out.print(valores[fila][colum] + " "); //array de una dimensio amb la fila fixa (sense canviar)
            }
            System.out.println("");
        }
    }
    
}
