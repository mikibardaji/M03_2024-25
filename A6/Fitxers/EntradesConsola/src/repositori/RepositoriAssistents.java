package repositori;

import dades.LlistaAssistents;
import model.Assistent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoriAssistents {
    private final String FITXER = "assistents.txt";

    public List<Assistent> carregarAssistents(String nom_fitxer) throws FileNotFoundException, IOException {
        List<Assistent> llista = new ArrayList<>();
        File f = new File(FITXER);
//        try {
            BufferedReader br = new BufferedReader(new FileReader(f)) ;
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] parts = linia.split(",");
                if (parts.length == 5) { //no es obligatori pero si la fem podria //
                    //podria llançar una excepció apart
                    String nom = parts[0].trim();
                    int edat = Integer.parseInt(parts[1].trim());
                    String email= parts[2].trim();;
                    String tipus = parts[3].trim();
                    String dia = parts[4].trim();
                    llista.add(new Assistent(nom, edat, email, tipus, dia));
                }
            }
        //} /*catch (IOException e) {
       //     System.err.println("No s'ha pogut llegir el fitxer: " + e.getMessage());
       // }*/
        return llista;
    }

    public void guardarAssistent(Assistent a) {
        File f = new File(FITXER);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
            bw.write(a.toCSV());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar l'assistent: " + e.getMessage());
        }
    }

    public void generarInforme(String informe, List<Assistent> assistents, double edatMitjana,
                               java.util.Map<String, Integer> perTipus) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(informe))) {
            bw.write("INFORME DEL FESTIVAL\n");
            bw.write("====================\n");
            bw.write("Total d'assistents: " + assistents.size() + "\n");
            bw.write("Edat mitjana: " + String.format("%.2f", edatMitjana) + "\n");
            bw.write("Assistents per tipus d'entrada:\n");
            for (String tipus : perTipus.keySet()) {
                bw.write(" - " + tipus + ": " + perTipus.get(tipus) + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al generar l'informe: " + e.getMessage());
        }
    }
}