/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class PrestecDao {
    //colecccin de datos
    //mantenerlos (Alta/Baja/....)
    Map<Persona, Set<String>> Prestec;

    public PrestecDao() {
        Prestec = new HashMap<>();
    }

    public boolean afegirPrestec(Persona add, String titulo) {
        //comprovar si la persona existeix
        //ho comprovo perque si existeix 
        if (!Prestec.containsKey(add)) //no existe
        {
           Prestec.put(add, new HashSet<>());
        }
        
        //añado el libro 
        //si existe añado libro
        return Prestec.get(add).add(titulo);
        
    }
    
    
}
