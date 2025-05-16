package vista;

import dades.LlistaAssistents;
import model.Assistent;
import repositori.RepositoriAssistents;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VistaFestival {
    private final Scanner scanner;
    private final LlistaAssistents llista;
    private final RepositoriAssistents repo;

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
            System.out.println("6. Sortir");
            System.out.print("Tria una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1 :  mostrarAssistents(); break;
                case 2 :  mostrarAssistentsPerTipus(); break;
                case 3 :  mostrarEdatMitjana(); break;
                case 4 :  afegirAssistent(); break;
                case 5 :  generarInforme(); break;
                case 6 :  System.out.println("Fins aviat!");break;
                default :  System.out.println("Opció no vàlida.");break;
            }
        } while (opcio != 6);
    }

    private void mostrarAssistents() {
        List<Assistent> tots = llista.getTots();
        if (tots.isEmpty()) {
            System.out.println("No hi ha assistents registrats.");
        } else {
            for (Assistent tot : tots) {
                System.out.println(tot);
            }
        }
    }

    private void mostrarAssistentsPerTipus() {
        Map<String, Integer> comptats = llista.comptarPerTipusEntrada();
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
        llista.afegirAssistent(nou);
        repo.guardarAssistent(nou);
        System.out.println("Assistent afegit correctament.");
    }

    private void generarInforme() {
        repo.generarInforme("informe_festival.txt", llista.getTots(),
                llista.calcularEdatMitjana(), llista.comptarPerTipusEntrada());
        System.out.println("Informe generat com a informe_festival.txt");
    }

    public void mostrarMensaje(String message) {
        System.err.println(message);
    }

    public String demanarNomFitxer() {
        System.out.print("Nom fitxer dades entrada: ");
        return  scanner.nextLine();        
    }
}