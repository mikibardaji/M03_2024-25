/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exanen14022025ex3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exanen14022025Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom="", llibre="";
        String[] titolsLlibres = {
            "El Senyor dels Anells",
            "La historia interminable",
            "El Mon de Narnia",
            "Harry Potter i la pedra filosofal",
            "El Hobbit"
        };

        String[] nomsUsuaris = {
            "Jordi",
            "Laia",
            "Marc",
            "Nuria"
        };

        int[][] disponibilitat= new int[titolsLlibres.length][nomsUsuaris.length];
        //declarar array bidimensional amb funció dels llibres (files) i        columnes(usuaris)
        Scanner scanner = new Scanner(System.in);
        int opcio;
        do {
// Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1 - Solicitar llibre");
            System.out.println("2 - Mostrar disponibilitat");
            System.out.println("0 - Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine(); // Consumir el salt de línia
            switch (opcio) {
                case 1:
                    // Cridar a les funcions per sol·licitar llibre
                    nom = preguntarNom();
                    llibre = preguntarLlibre();

                    System.out.println("El teu nom és: " + nom);
                    System.out.println("El llibre que vols agafar és: "
                            + llibre);
                    
                    int fila = trobarFila(titolsLlibres, llibre);
                    //int columna = trobarColumna(nomsUsuaris, nom);
                    int columna = trobarFila(nomsUsuaris, nom);
                    
                    if (fila!=-1 && columna !=-1)
                    {
                        if (disponible(disponibilitat,fila))
                        {
                            disponibilitat[fila][columna] = 1;
                            System.out.println("Llibre correcte el marquen amb prestec ");
                        }
                        else
                        {
                            System.out.println("Llibre ja prestat");
                        }
                        
                        
                    }
                    else
                    {
                        System.out.println("Dades incorrectes de entrada " + nom +"-" + llibre);
                    }
                //aqui funció que tindrà que buscar quina fila ocupa el llibre

                            //també és tindrà que averiguar quina posició ocupa el usuari per saber la columna             .
                //buscar disponibilitat del llibre (recorrer tota la fila del llibrem i que no hi hagi cap 1. (Ajuda:
                //
                //si esta disponible marcar la posició (fila,columna) a 1.
                break;
                          case 2:
                              mostrarArray(disponibilitat);
                // Mostrar disponibilitat (aquí es pot afegir la l?gica)
                System.out.println("Mostrant disponibilitat...");
                //mostrar tot el array bidimensional
                break;
                case 0:
                System.out.println("Sortint del programa...");
                break;
                default:
                System.out.println("Opció no vàlida. Si us plau, intenta-ho de nou.");
    }


    }
    while (opcio != 0);
}
 // Funció que retorna el nom introduït
 public static String preguntarNom() {
    System.out.println("Fica el teu nom:");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
}
 // Funció que retorna el llibre introduït
 public static String preguntarLlibre() {
    System.out.println("Quin llibre vols agafar?");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
}

    private static int trobarFila(String[] titolsLlibres, String llibre) {
        for (int i = 0; i < titolsLlibres.length; i++) {
            if (titolsLlibres[i].equalsIgnoreCase(llibre))
            {
                return i;
            }
            
        }
        return -1;
    }

    private static boolean disponible(int[][] disponibilitat, int fila) {
        //fila fixa
        for (int col = 0; col < disponibilitat[fila].length; col++) {
            if (disponibilitat[fila][col] ==1)
            {
                return false; 
            }
        }
        return true;
    }

    private static void mostrarArray(int[][] disponibilitat) {
            for (int fila = 0; fila < disponibilitat.length; fila++) {
                for (int columna = 0; columna < disponibilitat[fila].length; columna++) {
                    System.out.print(disponibilitat[fila][columna] + "-");
                }
                System.out.println("");
        }
    }

}
