package model;

public class ContadorModel {
    int contador;

    public ContadorModel() {
        this.contador = 0;
    }
    
    
    public int incrementa() {
        return ++contador;
    }

    public int getContador() {
        return contador;
    }
    
    
}