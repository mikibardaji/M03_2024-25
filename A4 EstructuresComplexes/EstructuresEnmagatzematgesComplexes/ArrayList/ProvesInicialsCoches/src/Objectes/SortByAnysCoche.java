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
public class SortByAnysCoche implements Comparator<Coche> {

    @Override
    public int compare(Coche o1, Coche o2) {
        return o1.getAnys_antiguetat() - o2.getAnys_antiguetat();
    }
    
}
