/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitxercaracteracaracter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class FitxerLineaLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
//            escriureFitxerCaracter("provesCaracter.txt");
//            llegirFitxerCaracter("provesCaracter.txt");
            escriureFitxerLinea("provesLinea.txt");
            llegirFitxerLinea("provesLinea.txt");


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void escriureFitxerCaracter(String ruta) throws IOException {
        char[] letras = {'a','b','c','d','e','m','p','t'};
        File salida = new File(ruta);
        //FileWriter
        
        //agafa el fitxer i si existeix sobreescriu tot
        FileWriter fw = new FileWriter(salida);
        //agafaria el fitxer i escriu al final del text
        //FileWriter fw = new FileWriter(salida,true);
        for (char letra : letras) {
            fw.write(letra);
            fw.write("\n");
        }
        System.out.println("Fichero escrito... " + ruta);
        fw.close();
    }

    private static void llegirFitxerCaracter(String ruta) throws IOException {
        File salida = new File(ruta);
        FileReader rd = new FileReader(salida);
        
        char letra_leida;
        int num_letra_leida;
// es el mateix     
        do
        {
            num_letra_leida = rd.read();
            if (num_letra_leida!=-1)
            {
                letra_leida = (char) num_letra_leida;
                System.out.println("He leido " + letra_leida);
            }
        }while(num_letra_leida!=-1);
  
//       while((letra_leida = (char) rd.read())!=-1) /*-1 es cuando lee final fichero*/
//       {
//           System.out.println("He leido " + letra_leida);
//       }
       rd.close();
    }

    private static void escriureFitxerLinea(String ruta) throws IOException {
        String[] frases = {"frase1","frase12","frase3","frase4","frase5","frase6"};
        File f1 = new File(ruta);
        FileWriter fw = new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (String frase : frases) {
            bw.write(frase+"\n");
        }
        System.out.println("fichero escrito" + ruta);        
        bw.close();
        fw.close();
    }

    private static void llegirFitxerLinea(String ruta) throws IOException {
        File f1 = new File(ruta);
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String frase_leida;// = br.readLine();
        while ((frase_leida=br.readLine())!=null)
        {
            System.out.println("Leido... " + frase_leida);
            //frase_leida = br.readLine();
        }
        br.close();
        fr.close();
        
    }
    
}
