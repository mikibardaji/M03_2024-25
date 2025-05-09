package model;

public interface IGestorAlumnesDAO {
    // Retorna l'alumne actual (el que es mostra per pantalla)
    Persona getActual();

    // Guarda una nova nota per a l'alumne actual
    //sempre que estigui entre 0 i 10
    void guardarNotaActual(double nota) throws NumberFormatException;

    // Indica si hi ha un alumne següent en la llista
    boolean hiHaSeguent();

    // Indica si hi ha un alumne anterior en la llista
    boolean hiHaAnterior();

    // Avança a l'alumne següent
    void seguent();

    // Retrocedeix a l'alumne anterior
    void anterior();
}

