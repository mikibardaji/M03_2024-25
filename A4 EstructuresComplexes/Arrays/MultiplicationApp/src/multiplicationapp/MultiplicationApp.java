/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicationapp;

/**
 *
 * @author mabardaji
 */
import javax.swing.JOptionPane;
public class MultiplicationApp {
 
	public static void main(String[] args) {
 
		//Indicamos el tamaño
		String texto=JOptionPane.showInputDialog("Introduce un tamaño");
		int tamanio=Integer.parseInt(texto);
 
		//Creamos los arrays
		int array1[]=new int [tamanio];
		int array2[];
 
		//Rellenamos el array1
		rellenarNumAleatorioArray(array1, 10, 100);
 
		//Apuntamos el array2 al array1
		//array2=array1;
 
		//Creamos un nuevo array, usando el array1. Array1 tendra una nueva direccion.
		array2=new int[tamanio];
 
		//Lo volvemos a rellenar, ya que al crear el array de nuevo no contiene los numeros anteriores
		rellenarNumAleatorioArray(array2, 10, 100);
 
		//Contiene el array con el resultado de multiplicar los valores de los arrays
		int array3[]=multiplicador(array1, array2);
 
		//Mostramos el contenido de los arrays
 
		System.out.println("Array1");
		mostrarArray(array1);
 
		System.out.println("Array2");
		mostrarArray(array2);
 
		System.out.println("Array3");
		mostrarArray(array3);
 
                //Llamamos al recolector de basura
                System.gc();
 
	}
	public static void rellenarNumAleatorioArray(int lista[], int a, int b){
		for(int i=0;i<lista.length;i++){
			//Generamos un número entre los parametros pasados
			lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
		}
	}
 
	public static void mostrarArray(int lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println("En el indice "+i+" esta el valor "+lista[i]);
		}
	}
 
	public static int[] multiplicador(int array1[], int array2[]){
		int array3[]=new int[array1.length];
		for(int i=0;i<array1.length;i++){
			array3[i]=array1[i]*array2[i];
		}
		return array3;
	}
}
