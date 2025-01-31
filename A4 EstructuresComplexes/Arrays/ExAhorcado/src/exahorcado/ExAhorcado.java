/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exahorcado;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExAhorcado {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  //        El programa demanara inicialment la paraula i la guardara a un String.      
        String palabra;
        System.out.println("Pon la palabra a buscar");
        palabra = sc.next().toLowerCase();
        
////Despres creara un array de char de la mateixa longitud de la paraula escrita e inicializar a guions '-'
        char[] adivinar = new char[palabra.length()];
        inicializarGuions(adivinar);
        boolean adivinado = false;
        
        
       // do
      //  {
      //En cada torn es mostrara tot el array , amb els _ o les lletres encertades.
           mostrarPalabraGuiones(adivinar); 
           //Es demanara una lletra.
           System.out.print("Que letra quieres? "); 
           char letra = sc.next().charAt(0);
          //Es buscara al String en quina posició hi es la lletra i si existeix, es ficarà aquella lletra a la posició del array de char (teniu en compte que aquella lletra pot apareixer més d'un cop)  
           boolean encontrado = marcarLetraEncontradaExiste(palabra, adivinar, letra);

          
            
       // }while(!adivinado);
        


//
//En cada torn :
//



//Aquesta busqueda implementeu-la buscant-la al String, no al array de char (que també es podria fer).
//Tindras fins a 6 vides, quant et quedis sense vides, acaba el joc. o si encertes (cada errada es pintara un penjat diferent, podeu utilitzar la funció que esta adjuntada al document).
//El joc acaba, quant no et queda vides, o si no queden lletres per descubir o sigui que no hi ha guio
    }
 
private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
    }    

    private static void inicializarGuions(char[] adivinar) {
        for (int i = 0; i < adivinar.length; i++) {
            adivinar[i] = '_';
        }
    }

    private static void mostrarPalabraGuiones(char[] adivinar) {
            for (int i = 0; i < adivinar.length; i++) {
                System.out.print(adivinar[i]+" ");
        }
        System.out.println("");
    }

    
    /**
     * Buscar la letra en TODAS las posoiciones del string
     * Si encuentra la letra la va copiando en la misma posicion de adivinar
     * debera devolver true en este caso
     * false si recorre toda la palabra y no la encuentra
     * @param palabra
     * @param adivinar
     * @param letra
     * @return 
     */
    
    private static boolean marcarLetraEncontradaExiste(String palabra, char[] adivinar, char letra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
