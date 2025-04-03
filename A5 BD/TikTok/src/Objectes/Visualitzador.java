package Objectes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Classe Visualitzador
public class Visualitzador {
    private final String nick;
    private String nom;
    
    public Visualitzador(String nick, String nom) {
        this.nick = nick;
        this.nom = nom;
    }
    
    public String getNick() {
        return nick;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
}