/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositori;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Assistent;

/**
 *
 * @author mabardaji
 */
public class RepositoriAssistentsBinari {
    private static String fitxer = "dadesbinari.dat";
    
    
    public static int saveContactBinari(List<Assistent> lista) throws FileNotFoundException, IOException
    {
        int cont=0;
        File f = new File(fitxer);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Assistent assistent : lista) {
            oos.writeObject(assistent);
            cont++;
        }
        oos.close();
        fos.close();
        return cont;
    }
    
  
    public static List<Assistent> readContactBinari() throws IOException, ClassNotFoundException
    {
        List<Assistent> tots = new ArrayList<>();
        File f = new File(fitxer);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o;
        while ((o = ois.readObject()) != null)
        {
            if (o instanceof Assistent)
            {
                Assistent afegir = (Assistent) o;
                tots.add(afegir);
            }
        }
        ois.close();
        fis.close();
        return tots;
    }
}
