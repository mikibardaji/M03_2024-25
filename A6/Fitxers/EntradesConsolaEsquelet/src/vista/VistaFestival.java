package vista;

import dadesDAO.LlistaAssistents;
import java.io.IOException;
import java.util.HashMap;
import model.Assistent;
import repositori.RepositoriAssistents;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositori.RepositoriAssistentsBinari;

public class VistaFestival {
    private final Scanner scanner;
    private LlistaAssistents llista;
    //si fossin static no existiria l'atribut repo
    private RepositoriAssistents repo;

    public VistaFestival() {
        llista= null;
        repo = null;
        this.scanner = new Scanner(System.in);
    }
    
    public VistaFestival(LlistaAssistents llista, RepositoriAssistents repo) {
        scanner = new Scanner(System.in);
        this.llista = llista;
        this.repo = repo;
    }

    public void mostrarMenu() {
        int opcio;
        do {
            System.out.println("\n=== GESTOR DE FESTIVALS ===");
            System.out.println("1. Mostrar assistents");
            System.out.println("2. Assistents per tipus d'entrada");
            System.out.println("3. Edat mitjana");
            System.out.println("4. Afegir assistent");
            System.out.println("5. Generar informe");
            System.out.println("6. Gravar Fitxcer Binari");
            System.out.println("7. Llegir fitxer binari");            
            System.out.println("8. Sortir");
            System.out.print("Tria una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1 :  mostrarAssistents(); break;
                case 2 :  mostrarAssistentsPerTipus(); break;
                case 3 :  mostrarEdatMitjana(); break;
                case 4 :  afegirAssistent(); break;
                case 5 :  generarInforme(); break;
                case 6 :  gravarObjectesFitxerBinari();break;
                case 7 :  llegirObjectesFitxerBinari();break;
                case 8 :  System.out.println("Fins aviat!");break;
                default :  System.out.println("Opció no vàlida.");break;
            }
        } while (opcio != 8);
    }

    private void mostrarAssistents() {
        List<Assistent> tots = llista.getTots();
        if (tots.isEmpty()) {
            System.out.println("No hi ha assistents registrats.");
        } else {
            int cont=1;
            for (Assistent tot : tots) {
                System.out.println(cont + " - " + tot); //toString
                cont++;
            }
            System.out.println("Registros mostrados ... " + tots.size());
        }
    }

    private void mostrarAssistentsPerTipus() {
        String[] tipus = {"VIP","Normal"};
        Map<String, Integer> comptats = new HashMap<>();
//        for (String tipo : tipus) {
//            int contador = llista.comptarPerTipoEntrada(tipo);
//            System.out.println("Tipus: " + tipo + " | Comptador: " + contador);
//        }
//        for (String tipo : tipus) {
//            int contador = llista.comptarPerTipoEntrada(tipo);
//            comptats.put(tipo, contador);
//        }
        
        
        comptats = llista.comptarPerTipusEntrada();
        for (Map.Entry<String, Integer> entrada : comptats.entrySet()) 
        {
            System.out.println("Tipus: " + entrada.getKey() + " | Comptador: " + entrada.getValue());
        }
    }

    private void mostrarEdatMitjana() {
        double mitjana = llista.calcularEdatMitjana();
        System.out.printf("Edat mitjana: %.2f\n", mitjana);
    }

    private void afegirAssistent() {
        try {
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Edat: ");
            int edat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("email: ");
            String email = scanner.nextLine();
            System.out.print("Tipus d'entrada: ");
            String tipus = scanner.nextLine();
            System.out.print("Dia entrada: ");
            String dia = scanner.nextLine();
            
            Assistent nou = new Assistent(nom, edat, email, tipus, dia);
            repo.guardarAssistent(nou);
            llista.afegirAssistent(nou);

            System.out.println("Assistent afegit correctament.");
        } catch (IOException ex) {
            System.out.println("No se ha guardado en el archivo");
        }
    }

    private void generarInforme() {
        try {
            repo.generarInforme("informe_festival.txt", llista.getTots(),
                    llista.calcularEdatMitjana(), llista.comptarPerTipusEntrada());
            System.out.println("Informe generat com a informe_festival.txt");
        } catch (IOException ex) {
            Logger.getLogger(VistaFestival.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarMensaje(String message) {
        System.err.println(message);
    }

    public String demanarNomFitxer() {
        System.out.print("Nom fitxer dades entrada: ");
        return  scanner.nextLine();        
    }

    private void gravarObjectesFitxerBinari() {
        try {
            int cont = RepositoriAssistentsBinari.saveContactBinari(llista.getTots());
            System.out.println("gravats " + cont);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void llegirObjectesFitxerBinari() {
        try {
            List<Assistent> tot = RepositoriAssistentsBinari.readContactBinari();
        } catch (IOException ex) {
            Logger.getLogger(VistaFestival.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaFestival.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}