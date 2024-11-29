/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 * s (x1,y1) y (x2,y2)
 * @author mabardaji
 */
public class Rectangulo {
    private Punto superior;
    private Punto inferior;

    public Rectangulo(Punto superior, Punto inferior) {
        this.superior = superior;
        this.inferior = inferior;
    }
    
    
    
    
    public Rectangulo(int x1, int y1, int x2, int y2)
    {
        //que x1 y y1 es la parte inferior
        if (x1<x2 && y1<y2)
        {//valores valiod
            inferior = new Punto(x1, y1);
            superior = new Punto(x2,y2);
            
        }
        else
        {
            System.out.println("Coordenadas no validas");
        }
    }

    public Punto getSuperior() {
        return superior;
    }

    public Punto getInferior() {
        return inferior;
    }

    public void setSuperior(int x, int y) {
        if (inferior.getX()<x && inferior.getY()<y)
        {
            this.superior.setXY(x, y);
        }
        
    }

    public void setSuperior(Punto A) {
        if (inferior.getX()<A.getX() && inferior.getY()<A.getY())
        {
            this.superior.setXY(A.getX(),A.getY() );
        }
    }    
    
    public void setInferior(int x, int y) {
        if (superior.getX()>x && superior.getY()>y)
        {
            this.inferior.setXY(x, y);
        }
    }
    
    
    public int getPerimetro()
    {
        int altura = superior.getY()- inferior.getY();
        int base = superior.getX() - inferior.getX();
        return altura*2 + base*2;
    }
    
    public int getArea()
    {
        int altura = superior.getY()- inferior.getY();
        int base = superior.getX() - inferior.getX();
        return base*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo => " + "Punto superior=" + superior + ", inferior= " + inferior ;
    }
   
}
