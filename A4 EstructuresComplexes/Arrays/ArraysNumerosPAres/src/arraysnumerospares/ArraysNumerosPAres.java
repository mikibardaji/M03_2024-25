/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysnumerospares;

import java.util.Random;

/**
 * plenar un array de 10 posicions amb aleatoris o introduït per l'usuari
 * i despres plenar un segon array que contingui sol els numeros parells del primer.
 * i mostrar el segon array pero sol els numeros insertats.. 
 * @author mabardaji
 */
public class ArraysNumerosPAres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aleatorios = new int[10];
        int[] pares = new int[10];//todo esta a 0
        //inicializar pares a un valor no posible
        //en este caso me vale el 0
        rellenarAleatorio(aleatorios);
        mostrarArray(aleatorios);
        
        buscarPares(aleatorios, pares);
        mostrarSoloPares(pares);
    }

    private static void rellenarAleatorio(int[] aleatorios) {
        Random rd = new Random();
        
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = rd.nextInt(1, 11);
        }
    }

    private static void mostrarArray(int[] aleatorios) {
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.print(aleatorios[i]+"-");
        }
        System.out.println("");
    }

    
    /**
     * Recorre el array de aleatorios y por cada par encontrado 
     * lo copia en el array de pares-
     * @param aleatorios
     * @param pares 
     */
    private static void buscarPares(int[] aleatorios, int[] pares) {
            int i_pares=0;
            for (int i_aleatorios = 0; i_aleatorios < aleatorios.length; i_aleatorios++) 
            {
                if (aleatorios[i_aleatorios]%2==0)
                {
                    //si no quiero repeticion
                    //metodo que le paso el numero par y el array pares
                    //recorrro desde el principio y si lo encuentro
                    //no hago nada y si no lo encuentro (encuentro un 0)
                    //lo pongo
                    pares[i_pares] = aleatorios[i_aleatorios];
                    i_pares++;
                }
            }
    }

    /**
     * Muestra el array pero sin contar posiciones "vacias"
     * @param pares 
     */
    private static void mostrarSoloPares(int[] pares) {
        for (int i = 0; i < pares.length; i++) {
            if (pares[i]!=0)
            {
                System.out.print(pares[i]+"-");
            }
            else
            {
                i = pares.length; //termino array
                //al primer 0 que me he encontrado
            }
        }
    }
    
}
