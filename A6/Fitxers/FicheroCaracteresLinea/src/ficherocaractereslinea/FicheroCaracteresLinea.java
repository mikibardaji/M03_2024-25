/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherocaractereslinea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author usuari
 */
public class FicheroCaracteresLinea {

    static private String nom_fitxer = "linea.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        escriureFitxerCaractersLinea();
        lecturaFitxerCaractersLinea();
    }

    private static void escriureFitxerCaractersLinea() {
        String[] list = {"one", "two", "three", "four"};
        try {
            File file = new File(nom_fitxer);
            FileWriter file_writer = new FileWriter(file); // A stream that connects to the text file
            BufferedWriter bufferedWriter = new BufferedWriter(file_writer); // Connect the FileWriter to the BufferedWriter

            for (String s : list) {
                bufferedWriter.write(s + "\n"); //afegeixo salt de linea
            }
            System.out.println("Fitxer escrit");
            bufferedWriter.close (); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void lecturaFitxerCaractersLinea() 
    {
        try {
            File file = new File(nom_fitxer);
            FileReader file_reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(file_reader); // Connect InputStreamReader to a BufferedReader

            
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Fitxer llegit");
            bufferedReader.close(); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
