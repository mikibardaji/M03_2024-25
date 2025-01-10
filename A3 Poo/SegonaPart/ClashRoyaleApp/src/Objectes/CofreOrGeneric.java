/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public abstract class CofreOrGeneric extends CofreGeneric{
    protected Carta card3;
   
    
    @Override
    public void mostrar_cofre2(String nom)
    {
        super.mostrar_cofre2(nom);
        System.out.println("Tinc " + card3.getNumCartesRepetides() + " cartes de " + card3.getNom());      
    }    
}
