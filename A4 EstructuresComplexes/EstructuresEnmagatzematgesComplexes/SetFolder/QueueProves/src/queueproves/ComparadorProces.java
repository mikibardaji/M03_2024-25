/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueproves;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class ComparadorProces implements Comparator<Proces> {
    @Override
    public int compare(Proces p1, Proces p2) {
        return Integer.compare(p1.prioritat, p2.prioritat); // Prioritat més baixa = més important
    }

}
