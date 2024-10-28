/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero, num_apostado,dinero_apostado,bola, dinero_ganado;
        char sigo;
        dinero = pedirValor("Cuanto dinero tienes inicialmente?");
        
        do
        {
            num_apostado = pedirNumero();
            System.out.println("apuestas al " + num_apostado);
            dinero_apostado = pedirDineroApuesta(dinero);
            bola = caidaBola();
            pintaAsteriscos(bola);
            dinero = dinero - dinero_apostado;
            if (eresGanador(bola, num_apostado))
            {//ganado
                dinero_ganado = ganancias(dinero_apostado, num_apostado);
                dinero+=dinero_ganado;
            }
            else
            {// perdido
                System.out.println("Has perdido");
               
            }
            System.out.println("Tienes " + dinero + "€");
            sigo = seguirJugando();
            
        }while(puedesJugar(sigo, dinero));
        
        System.out.println("Adios te vas con " + dinero);
        
        
    }
    
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    
    public static int pedirNumero()
    {
        int valor;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
        valor = sc.nextInt();
        }while(valor<=0 || valor>38);
    //}while(!(valor>=1 && valor<=38));
        return valor;
    }
    
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        Random rd = new Random();
        int bola = rd.nextInt(1, 37);
        return bola;
    }

    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo,
     * la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero)
    {
        boolean sigues=false;
        if (respuesta=='s' && dinero>0)
        {
            sigues = true;
        }
        else
        {
            sigues = false;
        }
        return sigues;
    }

    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        if (num_apostado>=1 && num_apostado<=36)
        {
            dinero_apostado = dinero_apostado*35;
        }
        //if (num_apostado>=37 && num_apostado<=38)
        if (num_apostado==37 || num_apostado==38)
        {
            dinero_apostado = dinero_apostado*2;
        }
        return dinero_apostado;
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, 
     * y devolvera el dinero siempre que sea valido positivo 
     * y no superior al dinero de la cartera
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
         int dinero;
         Scanner sc = new Scanner(System.in);
         do{
         System.out.println("Cuanto quieres apostar (1 a "+ dinero_disponible + " €)");
         dinero = sc.nextInt();
         if (dinero<0 ||dinero>dinero_disponible)
         {
             System.out.println("pon valor valido");
         }
         }while(dinero<0 ||dinero>dinero_disponible);
         
         return dinero;
     } 
     
              /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
        boolean ganador = false;
        if (bola==num_apostado)
        {
            ganador=true;
        }
        else if (num_apostado==37 && (bola%2!=0))
        { //impar
            ganador=true;
        }
        else if (num_apostado==38 && (bola%2==0))
        { //par
            ganador=true;
        }        
      return ganador;   
    }
 
    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, 
     * valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    
     public static char seguirJugando()
     {
         char respuesta;
         Scanner sc = new Scanner(System.in);
         do{
         System.out.println("Quieres continuar(S/N/s/n)");
         respuesta = sc.next().charAt(0);
         }while(!(respuesta == 's' || respuesta == 'S'
          || respuesta == 'n' || respuesta == 'N')
                 );
         return respuesta;
     }    
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
         for (int i = 1; i <= num; i++) {
             System.out.print("*");
         }
         System.out.println("-"+num);
     }     

    public static int pedirValor(String frase){
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        valor = sc.nextInt();
        return valor;
    }
     
     
    
}
