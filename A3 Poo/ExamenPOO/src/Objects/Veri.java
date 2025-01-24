/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public final class Veri extends Pokemon {
    private boolean defensa;
    public Veri(llistaNoms Nombre){
        super(Nombre);
        this.LP = 40;
        defensa = false;
    }
    
    public Veri(){
        super();
        this.LP = 40;
    }
    

    @Override
    public void recibirImpacto(Pokemon ob) {
        if(LP <= 15){
            defensa = true;
            System.out.println("Se ha activado la defensa, todos los ataques son un 50% menos efectivos.");
        }
        
        if(ob instanceof Electric){
            Electric pok = (Electric) ob;
            double atac = pok.Atac();
            if(defensa){
                System.out.println("Este tipo es poco efectivo contra " + nomPokemon);
                LP -= (atac * 0.75) * 0.5;
            }else{
                System.out.println("Este tipo es poco efectivo contra " + nomPokemon);
                LP -= atac * 0.75;
            }

        }else{
            double atac = ob.Atac();
            if(defensa){
                System.out.println("Este tipo es poco efectivo contra " + nomPokemon);
                LP -= atac * 0.5;
            }else{
                LP -= atac;
            }
        }
        
        if(LP <= 0){
            vida = false;
        }
        
        mostrarEstadoPokemon();
    }
}
