/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaplenar;

import Objectes.Ampolla;

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
        //IR VERTIENDO Y MOSTRANDO CUANTO LIQUIDO ME QUEDA
        do{
            vertido = bottle85.verter();
            System.out.println("he vertido "+ vertido + " me queda " + bottle85.getLiquid_actual());
        }while(!bottle85.buit());
        //CUANDO NO TENGO LIQUIDO DIGO QUE YA ESTA Y PARO
        
        
        
        
        
        
        
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
