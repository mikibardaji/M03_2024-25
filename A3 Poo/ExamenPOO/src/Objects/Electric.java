/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public final class Electric extends Pokemon {
    private int potenciador;
    
    public Electric(llistaNoms Nombre){
        super(Nombre);
        this.LP = 40;
        potenciador = 2;
        
    }
    
    public Electric(){
        super();
        this.LP = 40;
    }
    
    @Override
    public int Atac() {
        int random = super.Atac();
        if(random <= 4 & potenciador > 0){
            random += 5;
            potenciador--;
            System.out.println("La fuerza ha sido potenciada, quedan: " + potenciador + " potenciadores");
            System.out.println("Força d'atac: " + random);
        }else{
            System.out.println("Força d'atac: " + random);
        }
        return random;
    }

    @Override
    public void recibirImpacto(Pokemon ob) {
        int ataque = ob.Atac();
        if(ob instanceof Aigua){
            System.out.println("Este tipo es poco efectivo contra " + nomPokemon);
            LP -= ataque * 0.75;
        }else{
            LP -= ataque;
        }
        
        if(LP <= 0){
            vida = false;
        }
        mostrarEstadoPokemon();
    }
}
