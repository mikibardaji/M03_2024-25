/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Got {
    //Atributs
    private final int capacitat; //capacitat Maxima got
    private int liquid_actual; //capacitat actiañ
    private final String Material;
    private static int num_gots;

    public Got(int capacitat) {
        this.capacitat = capacitat;
        liquid_actual=0;
        Material = "Vidre";
        num_gots++;
    }

    public int getLiquid_actual() {
        return liquid_actual;
    }

    public void setLiquid_actual(int new_liquid) {
        if (new_liquid<=capacitat)
        {
            this.liquid_actual = new_liquid;
        }
        else if (new_liquid>capacitat)
        {
            this.liquid_actual = capacitat;
        }
    }

    public static int getNum_gots() {
        return num_gots;
    }

//    public static void setNum_gots(int num_gots) {
//        Got.num_gots = num_gots;
//    }

    public int getCapacitat() {
        return capacitat;
    }

    public String getMaterial() {
        return Material;
    }
    
    public void plenar(int new_liquid)
    {
        setLiquid_actual(liquid_actual + new_liquid);
    }
    
    public boolean  ple()
    {
        return liquid_actual >=capacitat;
    }
    
    
    
    
}
