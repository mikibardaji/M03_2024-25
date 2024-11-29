/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author mabardaji
 */
public class Articulo {
    private String nombre;
    private double precio;
    private final double IVA;
    private int cuantosQuedan;
    
    public Articulo(String nombre_articulo, double precio_art, int stock)
    {
        nombre = nombre_articulo;
        precio_art = precio;
        IVA = 0.21;
        cuantosQuedan = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio>=0)
        {
            this.precio = precio;
        }
        else
        {
            System.out.println("Precio negativo no valido");
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan>=0)
        {
            this.cuantosQuedan = cuantosQuedan;
        }   
    }

    @Override
    public String toString() {
        return "Articulo " + nombre + " tiene un precio de " + precio ;
    }
    
    //e devuelva el precio de venta al público (PVP) con iva incluido.
    public double getPVP()
    {
        double pvp = precio * (1 + this.IVA);
        return pvp;
    }
    
    //o que devuelva el PVP con un descuento pasado como argumento.
    public double getPVP(double descuento)
    {
        double PVP  = this.getPVP();
        double PVP_DESC = PVP - descuento;
        return PVP_DESC;
    }
    
    //Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es
// posible). Devolverá true si ha sido posible (false en caso contrario).
    public boolean vender(int cantidad)
    {
        if (cantidad>0)
        {
            if(cantidad>cuantosQuedan)
            {
                System.out.println("No puedo vender");
                return false;
            }
            else
            {
                this.cuantosQuedan -= cantidad;
                return true;
            }
        }
        else
        {
            System.out.println("No vendemos cantidades negativas");
            return false;
        }
        
    }
    
    /*
    Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’ (si
es posible). Devolverá true si ha sido posible (false en caso contrario).
    no podemos tener mas de 100 sino false*/
    public boolean almacenar(int cantidad_nueva)
    {
        if((cantidad_nueva+cuantosQuedan)<=100)
        {
            this.cuantosQuedan += cantidad_nueva;
            return true;
        }
        else
        {
            this.cuantosQuedan=100;
            return false;
        }
        
    }
    
}
