/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author usuari
 */
public class DAOImatges {
    private String[] rutesImatges = {"001.png", "002.png"};
    private int indexActual;

    public DAOImatges() {
        indexActual = 0;
    }
    

    public String carregarNovaImatge()
    {
        indexActual = (indexActual + 1) % rutesImatges.length;
        return rutesImatges[indexActual];
    }
    
    public String getImatgeActual()
    {
        return rutesImatges[indexActual];
    }
}
