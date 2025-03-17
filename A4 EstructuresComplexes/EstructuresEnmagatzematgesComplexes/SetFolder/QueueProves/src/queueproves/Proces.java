/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueproves;

/**
 *
 * @author mabardaji
 */
class Proces {
    String nom;
    int prioritat;

    public Proces(String nom, int prioritat) {
        this.nom = nom;
        this.prioritat = prioritat;
    }

    @Override
    public String toString() {
        return "Proces: " + nom + " | Prioritat: " + prioritat;
    }
}

