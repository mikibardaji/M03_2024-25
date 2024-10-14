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

Per fer-ho, el programa haur� de generar nombres enters aleatoris amb valor absolut no superior al l�mit que inicialment indiqui l�usuari i preguntar a l�usuari el resultat del c�lcul.

El primer pas, doncs, ser� preguntar a l�usuari el valor absolut m�xim (LIMIT) dels nombres amb els quals es faran les sumes.

El programa iniciar� un bucle per generar aleat�riament dos nombres enters entre  1 i +LIMIT (ambd�s no inclosos) i preguntar a l�usuari el resultat de la suma dels dos nombres, comprovar si la resposta �s correcta o no i informar l�usuari.

A cada iteraci�, el programa preguntar� a l�usuari si vol continuar o no i actuar� en conseq��ncia.
Al final del programa, un cop l�usuari ha decidit no continuar o a arribat al nombre m�xim d�errades, informar� del nombre d�encerts i del nombre d�errors.

Versi� 2.0 (0,50 punt)*: El programa tamb� limitar� el nombre d�errades a 3. Un cop arribi a aquest nombre d�errades, finalitza el bucle.

Versi� 3.0 (0,50 pts)*: El programa generar� aleatoris de -LIMIT a +LIMIT, i funcionar� com fins ara


A la documentaci� del codi cal justificar el tipus d�estructures escollides.

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
