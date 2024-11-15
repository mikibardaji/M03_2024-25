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
        final String BUENAS = "BUENOS DIAS";
        final String HABLA = "HABLA CON LA ";
        final String CUENTA = "CUENTAVOCALES A ";
        Scanner sc = new Scanner(System.in);
        //pedir nombre y guardarlo
        System.out.println("Hola, como te llamas?");
        String nombre = sc.nextLine();
        boolean salir=false;
        //pedir instruccion
        do{
            
        
            String instruction = pedirInstruccion();

            //validarsies validar
            if (instruccionValida(instruction, ORDENOK))
            { //cierto 
                //recortar frase para quedarme con la orden a secas
                String orden = cogerFrase(instruction, ORDENOK);
                orden = orden.toUpperCase();
                if (orden.equals(BUENAS))
                {
                    decirBuenosDias(nombre);
                }
                else if(orden.equals("BUENAS NOCHES"))
                {
                    decirBuenasNoches(nombre);
                    salir=true;
                }
                else if(orden.equals("CANTA UNA CANCION"))
                {
                    canta();
                    salir=true;
                }
                else if(orden.startsWith(HABLA))
                {
                    hablarConLetra(orden);  
                }
                else if(orden.startsWith(CUENTA))
                {
                    cuentaVocales(orden, CUENTA);
                }
                System.out.println("orden "+ orden);
            }
            else
            {
                System.out.println("Instruccion no empieza por alexa ");
            }
        }while(!salir);
        
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

    private static void decirBuenosDias(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void decirBuenasNoches(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void canta() {
//        String[] frase = {"Dos","Tres"};
//        for (int posicion = 0; posicion < frase.length; posicion++) {
//            System.out.println(frase[posicion] + " elefantes se balanceaban\n" +
//"Sobre la tela de una araña, como veía que resistía, fueron a llamar otro elefante");
//        }
                
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " elefantes se balanceaban\n" +
"Sobre la tela de una araña, como veía que resistía, fueron a llamar otro elefante");
            
        }
    }

    private static void hablarConLetra(String orden) {
         final String HABLA = "HABLA CON LA ";
        final String ENCONTRAR_FRASE = "Habla con la X y di ";
        char letra = orden.charAt(HABLA.length());
        String frase=orden.substring(ENCONTRAR_FRASE.length());
        System.out.println(">" + letra + "---" + frase);
        frase = frase.replace('A', letra);
        frase = frase.replace('E', letra);
        frase = frase.replace('I', letra);
        frase = frase.replace('O', letra);
        frase = frase.replace('U', letra);
        System.out.println(frase);        
    }

    private static void cuentaVocales(String orden, String CUENTA) {
        String frase=orden.substring(CUENTA.length());
        System.out.println("frase > " + frase);
        int vocales =0;
        for (int posicion = 0; posicion < frase.length(); posicion++) {
            //en cada posicion pregunto si es vocal
            if (frase.charAt(posicion)=='A' 
                    || frase.charAt(posicion) == 'E'
                    || frase.charAt(posicion) == 'I'
                    || frase.charAt(posicion) == 'O'
                    || frase.charAt(posicion) == 'U')
            {
                vocales++;
            }
        }
        System.out.println("Vocales existentes " + vocales);
    }
    
}
