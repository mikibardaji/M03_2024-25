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
public class OrderBySatisfaction implements Comparator<Llibre> {

    @Override
    public int compare(Llibre o1, Llibre o2) {
        //return Double.compare(o1.getSatisfaction(), o2.getSatisfaction());
        return (int) (o1.getSatisfaction() - o2.getSatisfaction());
    }
    
}
