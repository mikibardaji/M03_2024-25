/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradesconsola;

import dades.LlistaAssistents;
import java.io.IOException;
import model.Assistent;
import repositori.RepositoriAssistents;
import vista.VistaFestival;
import java.util.List;
/**
 *
 * @author mabardaji
 */
public class EntradesConsola {

 public static void main(String[] args) {
   
         RepositoriAssistents repo = new RepositoriAssistents();
         LlistaAssistents totes_entrades = new LlistaAssistents();
         VistaFestival vista= new VistaFestival();
         String fitxer = vista.demanarNomFitxer();
       try {    
         List<Assistent> inicials = repo.carregarAssistents(fitxer);
         totes_entrades.carregaLlistaAssistents(inicials);
         
         
         vista = new VistaFestival(totes_entrades, repo);
         vista.mostrarMenu();
     } catch (IOException ex) {
         vista.mostrarMensaje(ex.getMessage());
     }
    }
    
}
