/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Examen {

    /**
     * Escriu un programa que permeti practicar les sumes de nombres enters.

Per fer-ho, el programa haurà de generar nombres enters aleatoris amb valor absolut no superior al límit que inicialment indiqui l’usuari i preguntar a l’usuari el resultat del càlcul.

El primer pas, doncs, serà preguntar a l’usuari el valor absolut màxim (LIMIT) dels nombres amb els quals es faran les sumes.

El programa iniciarà un bucle per generar aleatòriament dos nombres enters entre  1 i +LIMIT (ambdós no inclosos) i preguntar a l’usuari el resultat de la suma dels dos nombres, comprovar si la resposta és correcta o no i informar l’usuari.

A cada iteració, el programa preguntarà a l’usuari si vol continuar o no i actuarà en conseqüència.
Al final del programa, un cop l’usuari ha decidit no continuar o a arribat al nombre màxim d’errades, informarà del nombre d’encerts i del nombre d’errors.

Versió 2.0 (0,50 punt)*: El programa també limitarà el nombre d’errades a 3. Un cop arribi a aquest nombre d’errades, finalitza el bucle.

Versió 3.0 (0,50 pts)*: El programa generarà aleatoris de -LIMIT a +LIMIT, i funcionarà com fins ara


A la documentació del codi cal justificar el tipus d’estructures escollides.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        char continuar='s';
        int maximo, num1, num2, suma_ok, calculo_usuario, aciertos=0, fallos=0;
        System.out.println("pon valor maximo");
        maximo = sc.nextInt();
        do
        {
          num1 = rd.nextInt(maximo*(-1), maximo+1);
          num2 = rd.nextInt(maximo*(-1), maximo+1);
          suma_ok = num1 + num2;
          System.out.println(num1 + "- " + num2);
          System.out.println("Cuanto es " + num1 + "+" + num2 + "?") ;
          calculo_usuario = sc.nextInt();
          if (calculo_usuario == suma_ok)
          { //acierto
               aciertos++;
          }
          else
          {
              System.out.println("Has fallado");
              fallos++;
          }
          
          if(fallos<1)
                  {
                    System.out.println("Quiertes continuar(s/n)");
                    continuar = sc.next().charAt(0);     
                  }
          
        }while(continuar!='n' && continuar!='N' && fallos<1);
        
        System.out.println("Has acertado " + aciertos);
        
        
    }
    
}
