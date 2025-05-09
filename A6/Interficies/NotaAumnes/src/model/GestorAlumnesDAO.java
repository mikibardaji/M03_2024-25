package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GestorAlumnesDAO implements IGestorAlumnesDAO {
    private List<Persona> alumnes;
    private int indexActual = 0;

    public GestorAlumnesDAO() {
        alumnes = new ArrayList<>();
        Random rd =new Random();
        for (int i = 1; i <= 10; i++) {
            alumnes.add(new Persona("Alumne " + i, "DNI" + i, rd.nextDouble()*10));
        }
    }

    public Persona getActual() {
        return alumnes.get(indexActual);
    }

    public void guardarNotaActual(double nota) throws NumberFormatException {
        if (nota < 0 || nota > 10) {
                throw new NumberFormatException("Introdueix una nota vàlida entre 0 i 10.");
            }
        else
        {
            alumnes.get(indexActual).setNota(nota);
        }
        
    }

    public boolean hiHaSeguent() {
        return indexActual < alumnes.size() - 1;
    }

    public boolean hiHaAnterior() {
        return indexActual > 0;
    }

    public void seguent() {
        if (hiHaSeguent()) indexActual++;
    }

    public void anterior() {
        if (hiHaAnterior()) indexActual--;
    }
}

