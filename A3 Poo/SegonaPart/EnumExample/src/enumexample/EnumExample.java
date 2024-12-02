/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumexample;

import Objectes.WeekDays;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EnumExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeekDays day, another_day;
        
        day = WeekDays.SATURDAY;
        System.out.println("name " + day.name());
        System.out.println("Position " + day.ordinal());
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el dia de la semana");
        String dia = sc.nextLine();
        another_day = WeekDays.valueOf(dia);
        System.out.println("another day " + another_day.name());
        System.out.println("Comparo dias " + another_day.compareTo(day));
    }
    
}
