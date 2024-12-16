/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class Brawler {
    protected int life;
    protected int atack;
    protected int speed;
    
    public void correr()
    {
        System.out.println("Estoy corriendo a " + speed + " km/h");
    }
    
    public  abstract void saludo(); //no tenen codi 
    //per obligar a tots els fills a que tinguin aquest metode , però el codi es diferent
}
