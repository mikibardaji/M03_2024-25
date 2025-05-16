/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheroscaracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author usuari
 */
public class FicherosCaracteres {

    static private String nom_fitxer = "entrada.txt";
    public static void main(String[] args) {
        
        escriureFitxerCaracter();
        llegitFitxerCaracter();
                
	}

    private static void escriureFitxerCaracter() 
    {
        File entrada = new File(nom_fitxer);
        char[] list = {'a', 'e', 'i', 'o', 'u'};

        try {
            FileWriter fs = new FileWriter(entrada);
            //BufferedWriter fs = new BufferedWriter(new FileWriter(args[0]));
            for (int i = 0; i < list.length; i++) {
                fs.write(list[i]);
            }
            System.out.println("Fitxer escrit caracter a caracter");
            fs.close();
        } catch (IOException e) {
            System.out.println("Input or output problem related to this exception:");
            e.printStackTrace();
        }
    }

    private static void llegitFitxerCaracter() 
    {
        File entrada = new File(nom_fitxer);
        int c; //character read
        try {
            FileReader fs = new FileReader(entrada);
            //BufferedReader fs = new BufferedReader(new FileReader(args[0]));
            while ((c = fs.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.print("\n");
            System.out.println("Fitxer llegit");
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Exception info:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Input or output problem related to this exception:");
            e.printStackTrace();
        }
    }

    }