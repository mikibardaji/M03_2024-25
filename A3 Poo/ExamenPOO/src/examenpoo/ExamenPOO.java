/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpoo;
import Objects.*;
/**
 *
 * @author alumne
 */
public class ExamenPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veri poke1 = new Veri(llistaNoms.Jigglypuff);
        Aigua poke2 = new Aigua(llistaNoms.Squirtle);
        
        do {
            System.out.println("Turno de: " + poke1.getNomPokemon());
            poke2.recibirImpacto(poke1);
            
            if(!poke2.isVida()){
                System.out.println("Gana " + poke1.getNomPokemon());
            }else{
                System.out.println("Turno de: " + poke2.getNomPokemon());
                poke1.recibirImpacto(poke2);
            }
            
            
            if(!poke1.isVida()){
                System.out.println("Gana " + poke2.getNomPokemon());
            }
          
            
            System.out.println("");
            

        } while (poke1.isVida() & poke2.isVida());
    }
    
}
