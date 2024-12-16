/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Futbolista extends Plantel {
    private int goles;

    public Futbolista(int id, String nombre, int edad, int goles) {
        super(id, nombre, edad, 1500);
        this.goles = goles;
    }

    public Futbolista(int id, String nombre)
    {
        super(id, nombre, 20, 1500);
        goles=0;
    }
    
    
   /* public void jugarPartido() {
        System.out.println(nombre + " est‡† jugant un partit.");
        salario += 1000; //salario = salario + 1000; 
    }*/

  

    @Override
    public void diaPartido() {
         System.out.println(nombre + " est‡† jugant un partit.");
        salario += 1000; //salario = salario + 1000; 
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " est√† entrenant.");
    }

    public int getGoles() {
        return goles;
    }
    
    
}