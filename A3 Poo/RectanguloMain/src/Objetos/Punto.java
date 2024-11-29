/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x; //sin validaciones 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void imprime()
    {
        System.out.println("("+x+","+y+")");
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    
    
    
    public void setXY(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public void desplaza(int dx, int dy)
    {
        this.x += dx;
        this.y += dy; //this.y = this.y + dy
    }
    
    public int distancia(Punto p) 
    {
        int px = p.getX();
        int py = p.getY();
        double result = (px-this.x)*(px-this.x) +  (py-this.y)*(py-this.y);
        return (int)Math.sqrt(result);   
    }
    
}
