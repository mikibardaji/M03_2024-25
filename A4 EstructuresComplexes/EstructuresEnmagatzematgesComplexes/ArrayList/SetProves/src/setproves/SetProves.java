/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setproves;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mabardaji
 */
public class SetProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> nomsConjuntH = new HashSet<>();
        nomsConjuntH.add("Justin");
        nomsConjuntH.add("Jose Miguel");
        nomsConjuntH.add("Solaymane");
        nomsConjuntH.add("Joan");
        
        System.out.println("HasShet: es un conjunt que no l'importa el ordre");
        System.out.println(nomsConjuntH);
        
        Set<String> nomsConjuntLH = new LinkedHashSet<>();
        //mostra per ordre d'inserció
        nomsConjuntLH.add("Harpreet");
        nomsConjuntLH.add("Jeremy");
        nomsConjuntLH.add("Elena");
        nomsConjuntLH.add("David");
        nomsConjuntLH.add("Juan");
        
        
        System.out.println("LinkedHashSet: es un conjunt que no l'importa el ordre");
        System.out.println(nomsConjuntLH);
        
        Set<String> nomsConjuntT = new TreeSet<>();
        //Set<String> nomsConjuntT = new TreeSet<>(clase que implementi comparator);
        nomsConjuntT.add("Juan");
        nomsConjuntT.add("Wenfu");
        nomsConjuntT.add("Jordi Joan");
        nomsConjuntT.add("Miquel Angel");
        
        System.out.println("Treemap: Ordenat per comparable ");
        System.out.println(nomsConjuntT);
        
        nomsConjuntT.remove("Miquel Angel");
        System.out.println("Treemap: Borrat element ");
        System.out.println(nomsConjuntT + " size " + nomsConjuntT.size());
        
        if(nomsConjuntT.contains("Wenfu"))
        {
            System.out.println("Existeix wenfu al conjunt");
        }
        
        Set<String> nomsConjuntT1 = new TreeSet<>();
        //Set<String> nomsConjuntT = new TreeSet<>(clase que implementi comparator);
        nomsConjuntT1.add("Juan1");
        nomsConjuntT1.add("Wenfu1");
        nomsConjuntT1.add("Jordi Joan");
        nomsConjuntT1.add("Miquel Angel");
        //Set<String> interseccion1 = nomsConjuntT;
        Set<String> interseccion = new TreeSet<>(nomsConjuntT);
        
        
        interseccion.retainAll(nomsConjuntLH);
        System.out.println("elementos interseccion " + interseccion);

        
        //trueure elements repetis A-B
        System.out.println("Conjunt T");
        System.out.println(nomsConjuntT);
        System.out.println("Conjunt T1");
        System.out.println(nomsConjuntT1);
        Set<String> diferencia = new TreeSet<>(nomsConjuntT);
        diferencia.removeAll(nomsConjuntT1);
        System.out.println("A-B" + diferencia);
        
        System.out.println(nomsConjuntT);
        System.out.println(nomsConjuntH);
        Set<String> union = new TreeSet<>(nomsConjuntT);
        union.addAll(nomsConjuntLH);
        System.out.println("A union B" + union);
    }
    
}
