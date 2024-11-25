/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaplenar;

//import Objectes.Ampolla;
//import Objectes.Got;
import Objectes.*;


/**
 *
 * @author mabardaji
 */
public class MaquinaPlenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vertido;
        //CREAR UNA BOTELLA DE 85
        Ampolla bottle85 = new Ampolla(85);
        //LLENARLA HASTA ARRIBA
        bottle85.omplir();
        
        //bottle85.plenar(bottle85.getCapacitat());
        if (bottle85.ple())
        {
            System.out.println("Esta ple");
        }
        Got glass= new Got(25);
        int sobrante=0;
        //IR VERTIENDO Y MOSTRANDO CUANTO LIQUIDO ME QUEDA
        do{
            vertido = bottle85.verter();
            if ((glass.getCapacitat() - glass.getLiquid_actual())>vertido)
            {
                
                glass.plenar(vertido);
                System.out.println("normal" + glass.getLiquid_actual());
            }
            else
            {
                sobrante = vertido - (glass.getCapacitat() - glass.getLiquid_actual());
                glass.plenar(vertido);
                
                
                //liquid sobrant que ficare al seguent got
                System.out.println("estic ple: " + glass.getLiquid_actual());
                System.out.println("sobra aquest liquid->" + sobrante);
                
            }
            if (glass.ple())
            {
                System.out.println("Creo nou got");
                glass = new Got(25);
                glass.plenar(sobrante);
            }
           
            
            System.out.println("got liquid " + glass.getLiquid_actual());
            //inicialitzar got
            //plenarlo
            System.out.println("he vertido "+ vertido + " me queda " + bottle85.getLiquid_actual());
        }while(!bottle85.buit());
        //CUANDO NO TENGO LIQUIDO DIGO QUE YA ESTA Y PARO
        //imprimir quants gots he utilitzats
        System.out.println("Gots utilitzats: " + Got.getNum_gots());
        
        
        
        
        
//        Ampolla plastic_bottle = new Ampolla("Plastic");
//        Ampolla XL_bottle = new Ampolla(2000);
//        
//        System.out.println("capacidad bottle " + bottle.getCapacitat());
//        bottle.setCapacitat(35);
//       System.out.println("capacidad bottle " + bottle.getCapacitat());
//        bottle.setCapacitat(-35);
//
//       System.out.println("capacidad bottle -35 " + bottle.getCapacitat());        
//        System.out.println("capacidad plastic_bottle " + plastic_bottle.getCapacitat());
//        System.out.println("capacidad XL_bottle " + XL_bottle.getCapacitat());
//        if (bottle.ple())
//        {
//            System.out.println("bottle llena");
//        }
//        else
//        {
//            System.out.println("bottle no llena");
//        }
//        if (plastic_bottle.ple())
//        {
//            System.out.println("plastic_bottle llena");
//        }
//        else
//        {
//            System.out.println("plastic_bottle no llena");
//        }
//        if (XL_bottle.ple())
//        {
//            System.out.println("XL_bottle llena");
//        }
//        else
//        {
//            System.out.println("XL_bottle no llena");
//        }

    }
    
}
