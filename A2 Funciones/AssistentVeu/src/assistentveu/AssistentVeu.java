/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assistentveu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AssistentVeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String ORDENOK = "alexa ";
        //pedir nombre y guardarlo
        
        //pedir instruccion
        String instruction = pedirInstruccion();
        
        //validarsies validar
        if (instruccionValida(instruction, ORDENOK))
        { //cierto 
            //recortar frase para quedarme con la orden a secas
            String orden = cogerFrase(instruction, ORDENOK);
            System.out.println("orden "+ orden);
        }
        else
        {
            
        }
        
        
    }

    private static String pedirInstruccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esperando instriccuón");
        String instruction = sc.nextLine();
        return instruction;
    }

    private static boolean instruccionValida(String instruction, String ok) {
        String minus = instruction.toLowerCase();
        if(minus.startsWith(ok))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Devuelve la instruction quitandole la parte inicial
     * @param instruction
     * @param ORDENOK parte inicial
     * @return 
     */
    private static String cogerFrase(String instruction, String ORDENOK) {
            //substring
            int inicio_orden = ORDENOK.length();
            String orden = instruction.substring(inicio_orden);
            return orden;
    }
    
}
