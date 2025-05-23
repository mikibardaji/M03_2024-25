package dadesDAO;

import model.Assistent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LlistaAssistents implements GestorAssistentsInterface{
    private List<Assistent> assistents;

    public LlistaAssistents() {
           assistents = new ArrayList<>();
    }

    public boolean afegirAssistent(Assistent a) {
       return assistents.add(a);
    }

    public List<Assistent> getTots() {
        return assistents;
    }

    public double calcularEdatMitjana() {
        if (assistents.isEmpty()) return 0;

        int sumaEdats = 0;

        for (Assistent assistent : assistents) {
            sumaEdats += assistent.getEdat();
        }

        return (double) sumaEdats / assistents.size();
    }

    public Map<String, Integer> comptarPerTipusEntrada() {
        Map<String, Integer> comptador = new HashMap<>();
        
        for (Assistent as : assistents) {
            String tipus  = as.getTipusEntrada();
            if (comptador.containsKey(tipus))
            {
                comptador.put(tipus, comptador.get(tipus)+1);
            }
            else
            {
                comptador.put(tipus, 1);
            }
        }
        
        return comptador;
    }

    public int totalAssistents() {
        return 0;
    }
    public int carregaLlistaAssistents(List<Assistent> inicial)
    {
       // assistents = inicial;
        for (Assistent as : inicial) {
            assistents.add(as);
        }
        return assistents.size();
    }

    public int comptarPerTipoEntrada(String tipo) {
        int cont=0;
        for (Assistent assistent : assistents) {
            if (assistent.getTipusEntrada().equalsIgnoreCase(tipo))
            {
                cont++;
            }
        }
        return cont;
    }
}