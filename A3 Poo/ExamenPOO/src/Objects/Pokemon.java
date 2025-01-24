/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.Random;

/*enum llistaNoms{
    Pikachu, Charizard, Bulbasaur, Squirtle, Jigglypuff, Eevee, Gengar, Snorlax, Lucario, Dragonite;
    
    public static llistaNoms random(){
        llistaNoms array[] = llistaNoms.values();
        return array[(int) (Math.random()*array.length)];
    }
}*/

/**
 *
 * @author alumne
 */
public abstract class Pokemon implements AccionesCombate{
    final protected llistaNoms nomPokemon;
    protected double LP;
    protected boolean vida;
    
    public Pokemon()
    {
        llistaNoms array[] = llistaNoms.values();
        Random rd = new Random();
        int pos = rd.nextInt(array.length);
        nomPokemon = array[pos];
       vida = true;   

    }
    public Pokemon(llistaNoms nomPokemon){
        this.nomPokemon = nomPokemon;
        vida = true;
    }

    public llistaNoms getNomPokemon() {
        return nomPokemon;
    }

    public double getLP() {
        return LP;
    }

    public boolean isVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nomPokemon + " LifePoints: " + LP; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pokemon ){
            Pokemon pok = (Pokemon) obj;
            return nomPokemon == pok.nomPokemon;
        }
        return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    protected void mostrarEstadoPokemon(){
        /*if(LP <= 0){
            this.vida = false;
        }*/
        String valor = LP > 0 ? " vive " : " muere " ; 
        String fuerza = "";
        for (int i = 0; i < LP; i++) {
            fuerza += "=";
        }
         System.out.print(nomPokemon + " tiene ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("=");
        }
        System.out.println("LP "+ valor + fuerza);
        System.out.println(nomPokemon + " tiene " + LP + "LP "+ valor + fuerza);
    }

    @Override
    public int Atac()
    {
        int random = (int) (Math.random()*11);
        System.out.println("Força d'atac: " + random);
        return random;
    }
    
}
