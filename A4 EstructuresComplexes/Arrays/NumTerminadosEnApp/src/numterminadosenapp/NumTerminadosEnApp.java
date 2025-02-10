/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numterminadosenapp;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author mabardaji
 */
public class NumTerminadosEnApp {

public static void main(String[] args) {

		//Indicamos el tamaño
		String texto=JOptionPane.showInputDialog("Introduce un tamaño");
		int num[]=new int[Integer.parseInt(texto)];

		int ultimoDigito;
		do{
			texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
			ultimoDigito=Integer.parseInt(texto);
		}while(!(ultimoDigito>=0 && ultimoDigito<=9));

		//rellenamos el array
		rellenarNumAleatorioArray(num, 1, 300);

		//Creamos un array que contenga los numeros terminados en el numero especificado
		int terminadosEn[]=numTerminadosEn(num, ultimoDigito);

		//Mostramos el resultado, mira el metodo de mostrarArrays
	//	mostrarArrayTerminadosEn(num);
		mostrarArrayTerminadosEn(terminadosEn);

	}
	public static void rellenarNumAleatorioArray(int lista[], int a, int b){
                Random rd = new Random();
		for(int i=0;i<lista.length;i++){
			//Generamos un número entre los parametros pasados
			lista[i]=rd.nextInt(a, b+1);
		}
	}

	public static void mostrarArrayTerminadosEn(int lista[]){
		for(int i=0;i<lista.length;i++){
			//Mientras no encuentre 0 lo muestro
			if(lista[i]!=0){
				System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
			}
                        else
                        {
                            i = lista.length; //para terminar
                        }
		}
	}

	public static int[] numTerminadosEn (int num[], int ultimo_numero){

		//Array que almacenara los numeros terminados en el numero pedido
		int terminadosEn[]=new int[num.length];
                //se almacenan sin dejar posiciones vacias (a 0)
		int numeroFinal=0;
                int contadorTermina=0;
		for (int i=0;i<num.length;i++){

			/*Residuo*/
			numeroFinal=num[i]%10;

			//Si el numero obtenido es el buscado, lo añadimos
			if (numeroFinal==ultimo_numero){
				terminadosEn[contadorTermina]=num[i];
                                contadorTermina++;
			}
		}

		return terminadosEn;
	}

}    
    
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
       /* int num = 456;
        String numString = String.valueOf(num);
        String ultimaPosicion = numString.substring(numString.length()-1);
        System.out.println(ultimaPosicion);
        int numFinal = Integer.parseInt(ultimaPosicion);*/
       
       
