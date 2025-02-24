/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class SortByMatricula implements Comparator<Coche>{

    //comparem els dos i han de donar positiu, negatiu o 0 si es igual
    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.getMatricula() - o2.getMatricula();
    }
    
}
