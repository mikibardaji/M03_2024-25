package repositori;

import model.Assistent;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositoriAssistents implements RepositoriAssistentsInterface{
    private String fitxer_nom;

    public List<Assistent> carregarAssistents(String nom_fitxer) throws FileNotFoundException, IOException {
        fitxer_nom = nom_fitxer;
        //on anirem guardant les dades
        List<Assistent> llista = new ArrayList<>();
        //file
        File f = new File(nom_fitxer); //amb ruta relativa
        //
        FileReader fr = new FileReader(f,StandardCharsets.UTF_8); // per llegir caracter a caracter
        //(char) fr.read i final dona -1
        //BufferedReader
        BufferedReader br = new BufferedReader(fr);
        String linia;
//        do
//        {
//            linia = br.readLine();
//            if (linia != null)
//            {
//                
//            }
//        }while(linia != null);
        
        while ((linia= br.readLine()) != null)
        {
            String[] partesCSV = linia.split(",");
            
            if(partesCSV.length ==5)
            {
             String nom = partesCSV[0];
             int edat = Integer.parseInt(partesCSV[1]);
             String email= partesCSV[2];
             String tipus = partesCSV[3];
             String dia = partesCSV[4];
             Assistent afegir = new Assistent(nom, edat, email, tipus, dia);
             llista.add(afegir);
            }
            else
            {
                System.out.println("Linea no gravada " + linia);
            }
        }
        br.close();
        fr.close();
//    para comprobar que esta bien        
//for (Assistent a : llista) {
//            System.out.println(a); 
//        }
//        
        return  llista ;
    }

    public void guardarAssistent(Assistent a) throws IOException{
        //file
        System.out.println(fitxer_nom);
        File f = new File(fitxer_nom); //amb ruta relativa
        //
        FileWriter fw;
        
            fw = new FileWriter(f,true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(a.toCSV());
        bw.newLine();
        bw.close();
        fw.close();
    }

    public void generarInforme(String informe, List<Assistent> assistents, double edatMitjana,
                               java.util.Map<String, Integer> perTipus) throws IOException {

        File f = new File("informe.txt"); //amb ruta relativa
        //
        FileWriter fw;
        
            fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("===Informe Festival===\n");
            bw.write("Total assistents: " + assistents.size() + "\n");
            bw.write("Edat Mitjana: " + edatMitjana);
            bw.write("assistens per tipus d'entrada");
        for (Map.Entry<String, Integer> entrada : perTipus.entrySet()) 
        {
            System.out.println("Tipus: " + entrada.getKey() + " | Comptador: " + entrada.getValue());
        }
            
    }
}