/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llibreriamath;


/**
 *
 * @author mabardaji
 */
public class LlibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v1 = UtilidadesPropias.Utilidades.pedirValorEnteroPositivo("Pon un valor entero");
        int v2 = UtilidadesPropias.Utilidades.pedirValorEnteroPositivo("Pon un segundo valor");
        System.out.println("Voy a generar un aleatorio entre "+ v1 + "-" + v2);
        System.out.println(UtilidadesPropias.Utilidades.aleatorio(v1, v2));
        
        
        
//        System.out.println("Numero Pi=" + Math.PI);
//        System.out.println("Numero E=" + Math.E);
//        
//        System.out.println(Math.abs(-5) + " * " + Math.abs(7));
//        System.out.println(Math.ceil(2.1));
//        
//        System.out.println(Math.copySign(89, 1));
//        System.out.println("Coseno de 30 : " + Math.cos(30));
//        System.out.println("hipotenusa : " + Math.hypot(2, 3));
//        System.out.println(Math.decrementExact(4));
//        System.out.println(Math.floor(2.9));
//        System.out.println(Math.negateExact(-3));
//        System.out.println(Math.min(2,6));
//        System.out.println("aleatorioa" + (int) (Math.random()*9));
//        System.out.println("potencia 2 elevado a 5 " + Math.pow(2, 5));
//        System.out.println(Math.nextUp(267));
        
        
    }
    
}
