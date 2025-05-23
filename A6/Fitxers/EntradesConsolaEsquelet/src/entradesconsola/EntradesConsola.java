/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradesconsola;

import dadesDAO.LlistaAssistents;
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
   
     //opcio 1
     //opcio 2 mes correcta es que tots els metodes de repositori assistents 
     //fosssin estatic per no tenir que crear una variable
         RepositoriAssistents repo = new RepositoriAssistents();
         LlistaAssistents totes_entrades = new LlistaAssistents(); //DAO
         VistaFestival vista= new VistaFestival();
         //String fitxer = vista.demanarNomFitxer();
         String fitxer = "assistents.txt";
         //System.out.println(fitxer);
       try {    
         //si fossin statics
         //List<Assistent> inicials = RepositoriAssistents.carregarAssistents(fitxer);
         List<Assistent> inicials = repo.carregarAssistents(fitxer);
         //carregar al DAO el arrayList
         int total_cargats = totes_entrades.carregaLlistaAssistents(inicials);
         vista.mostrarMensaje("Cargados " + total_cargats + " asistentes... ");
         
         vista = new VistaFestival(totes_entrades, repo);
         vista.mostrarMenu();
     } catch (IOException ex) {
         vista.mostrarMensaje(ex.getMessage());
     }
    }
    
}
