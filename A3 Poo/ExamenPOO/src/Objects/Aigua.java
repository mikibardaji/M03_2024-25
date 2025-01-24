/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Aigua extends Pokemon {
    private int corassa;
    
    public Aigua(llistaNoms Nombre){
        super(Nombre);
        this.LP = 35;
        corassa = 3;
    }
    
    public Aigua(){
        super();
        this.LP = 35;
    }



    @Override
    public void recibirImpacto(Pokemon ob) {
        int ataques = ob.Atac();
        if(ob instanceof Veri & corassa == 0){
            
            System.out.println("Este tipo es poco efectivo contra " + nomPokemon);
            LP -= ataques * 0.75;
        } else if (corassa > 0){
            corassa--;
            System.out.println("Se ha gastado una corassa corassa restantes: " + corassa);
        } else{
            LP -= ataques;
        }
        
        if(LP <= 0){
            vida = false;
            LP=0;
        }
        mostrarEstadoPokemon();
    }
    
}
