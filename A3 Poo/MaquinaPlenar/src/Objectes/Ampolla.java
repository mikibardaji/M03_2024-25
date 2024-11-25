/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class Ampolla {
    //Atributs
    private final int capacitat; //capacitat Maxima ampolla
    //Variables final no poden tenir metodoes que modifiquin valor (Setters)
    private final int obertura; //diametre del forat de l'ampolloa
    private boolean tapon; //si tiene o no tiene tapon
    private int liquid_actual;
    private final String Material;
    

    public Ampolla()
    {
        capacitat = 75;
        tapon = false;
        obertura = 1;
        Material = "Vidre";
        liquid_actual = 0;
    }
    
    public Ampolla(String new_material)
    {
        capacitat = 1000;
        tapon = false;
        obertura = 1;
        liquid_actual = 0;
        Material = new_material;
    }
    
    public Ampolla(int new_capacity)
    {
        tapon = false;
        obertura = 1;
        liquid_actual = 0;
         Material = "Vidre";
         capacitat = new_capacity;
    }
    
    /**
     * devuelve la capacidad de la botella
     * @return 
     */
    public int getCapacitat()
    {
        return capacitat;
    }
    /* setter no es valid perque la variable es tipus final
    public void setCapacitat(int new_capacitat)
    {
        if (new_capacitat>0)
        { //ok cambio
            capacitat = new_capacitat;
        }
        else
        { //no canvia el valor
            System.out.println("capacidad negativa"); 
        }
    } */

    public int getObertura() {
        return obertura;
    }



    public boolean isTapon() {
        return tapon;
    }

    public void setTapon(boolean tapon) {
        this.tapon = tapon;
    }

    public int getLiquid_actual() {
        return liquid_actual;
    }

    public void setLiquid_actual(int liquid_actual) {
        if (liquid_actual>=0 )
        {
            this.liquid_actual = liquid_actual;
        }
        else if ( liquid_actual>=capacitat)
        {
            this.liquid_actual = capacitat;
        }
        else
        {
            System.out.println("No cambio liquido actual");
        }
    }

    public String getMaterial() {
        return Material;
    }

    
    
    /**
     * fica el tap a l'ampolla (tapon=true)
     */
    public void tapar()
    {
        tapon = true;
    }
    
    public void obrir()
    {
        tapon = false;
    }
    
    public void omplir()
    {
        liquid_actual = capacitat;
    }
    
    public void plenar(int liquid)
    {
        if (liquid>0)
        {
            //opcio 1
//            liquid_actual += liquid;
//            if (liquid_actual>capacitat)
//            {
//                liquid_actual = capacitat;
//            }
            //opcio 2
            setLiquid_actual(liquid_actual+liquid);
        }
        else
        {
            System.out.println("liquid no potser negatiu");
        }
    }
    
    /**
     * Deixa la botella sense liquid i et retorna 
     * tot el liquid que s'ha tirat
     * @return liquid tirat
     */
    public int buidar()
    {
        int disponibilitat=liquid_actual;
        liquid_actual=0;
        return disponibilitat;
    }
    
    /**
     * buida 20 ml de la capacitat
     * @return 
     */
    public int verter()
    {
        return verter(20);
//        int liquido_verter= 20;
//        if (liquid_actual-liquido_verter >=0)
//        {
//            liquid_actual -= liquido_verter;
//        }
//        else
//        {
//            liquido_verter = liquid_actual;
//            liquid_actual -= liquido_verter; // o liquid_actual=0;
//        }
//        return liquido_verter;   
    }
    
    public int verter(int liquido_verter)
    {
        if (liquid_actual-liquido_verter >=0)
        {
            liquid_actual -= liquido_verter;
        }
        else
        {
            liquido_verter = liquid_actual;
            liquid_actual -= liquido_verter; // o liquid_actual=0;
        }
        return liquido_verter;
    }
    
    public boolean buit()
    {
        return liquid_actual <=0;
    }
    public boolean ple()
    {
        return liquid_actual >=capacitat;
    }            
}