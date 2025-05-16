package dades;

import model.Assistent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LlistaAssistents {
    private List<Assistent> assistents;

    public LlistaAssistents() {
        this.assistents = new ArrayList<>();
    }

    public void afegirAssistent(Assistent a) {
        assistents.add(a);
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

        for (Assistent assistent : assistents) {
            String tipus = assistent.getTipusEntrada();
            if (comptador.containsKey(tipus)) {
                comptador.put(tipus, comptador.get(tipus) + 1);
            } else {
                comptador.put(tipus, 1);
            }
    }

    return comptador;
    }

    public int totalAssistents() {
        return assistents.size();
    }
    public int carregaLlistaAssistents(List<Assistent> inicial)
    {
        for (Assistent assistent : inicial) {
            assistents.add(assistent);
        }
        return inicial.size();
    }
}