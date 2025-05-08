/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class DaoNoms {
    List<String> noms;

    public DaoNoms() {
        noms = Arrays.asList("Ash", "Misty", "Brock", "Iris", "Gary", "Serena", "Tracey");
    }

    public List<String> getNoms() {
        return noms;
    }
    
    public String getEntrenadorAleatori()
    {
        Random rd = new Random();
        return noms.get(rd.nextInt(noms.size()));
    }
    
    public String getEntrenadorPosicio(int i)
    {
        Random rd = new Random();
        return noms.get(i);
    }
    
    public int getNumEntrenadors()
    {
        return noms.size();
    }
    
    
}
