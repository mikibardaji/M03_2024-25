/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exahorcado;

import java.util.Arrays;
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
  //    El programa demanara inicialment la paraula i la guardara a un String.      
        String palabra;
        System.out.println("Pon la palabra a buscar");
        palabra = sc.next().toUpperCase();
        
////Despres creara un array de char de la mateixa longitud de la paraula escrita e inicializar a guions '-'
        char[] adivinar = new char[palabra.length()];
        inicializarGuions(adivinar);
        boolean adivinado = false;
        int vidas = 7;
        
        do
        {
      //En cada torn es mostrara tot el array , amb els _ o les lletres encertades.
           mostrarPalabraGuiones(adivinar); 
           //Es demanara una lletra.
           System.out.print("Que letra quieres? "); 
           char letra = sc.next().toUpperCase().charAt(0); //l'agafara amb majuscula
          //Es buscara al String en quina posici� hi es la lletra i si existeix, es ficar� aquella lletra a la posici� del array de char (teniu en compte que aquella lletra pot apareixer m�s d'un cop)  
           boolean encontrado = marcarLetraEncontradaExiste(palabra, adivinar, letra);
           if (!encontrado)
           {
               vidas--;
               dibujar(vidas);
           }
           else
           {
               System.out.println("Existe la letra");
               mostrarPalabraGuiones(adivinar); 
           }
           char[] palabraString = palabra.toCharArray();
           
           adivinado = Arrays.equals(adivinar, palabraString);
//           if (Arrays.equals(adivinar, palabraString))
//           {
//               adivinado = true;
//           }
//           else
//           {
//               adivinado = false;
//           }
           //adivinado = palabraAcertada(adivinar);
            
        }while(vidas>0 && !adivinado);
        
        if (vidas==0)
        {
            System.out.println("PALMASTE!!!");
        }
        else
        {
            System.out.println("GANASTE!!!!!");
        }

//
//En cada torn :
//



//Aquesta busqueda implementeu-la buscant-la al String, no al array de char (que tamb� es podria fer).
//Tindras fins a 6 vides, quant et quedis sense vides, acaba el joc. o si encertes (cada errada es pintara un penjat diferent, podeu utilitzar la funci� que esta adjuntada al document).
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
        System.out.println("Vidas restantes: "+ i);
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
        boolean encontrado=false;
        for (int i = 0; i < palabra.length(); i++) {
           if(palabra.charAt(i)==letra)
           {
               adivinar[i] = letra;
               encontrado=true;
           }
        }
        return encontrado;
    }

    
    private static boolean palabraAcertada(char[] adivinar) {
       boolean acertado=true;
       int i=0;
       while(i<adivinar.length)
       {
           if (adivinar[i]=='_')
           {
               acertado = false;
               return acertado;
           }
           i++;
       }
       return acertado; 
    }

}
