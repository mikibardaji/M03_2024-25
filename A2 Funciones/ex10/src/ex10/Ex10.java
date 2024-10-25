/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10 {

    /**
     * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
tres funciones que valide cada uno de los datos si es correcto
* un mes como maximo 30 dias (HECHO)
* el año sera valido si es a partir 1900
* mese validos de 1 a 12
* 
* y devuelva si es correcta o no.

     */
    public static void main(String[] args) {
        // pedir anyo, mes y dia
        int anyo = pedirValor("Pon un año: ");
        int mes = pedirValor("Pon un mes");
        int dia = pedirValor("Pon un dia");
        
        
        boolean validoDia=verificarDia(dia);
        boolean validoMes=verificarMes(mes);
        boolean validoAnyo=verificarAnyo(anyo);
        
        mostrarSalida(validoDia,validoMes,validoAnyo);
        
        
        
    }
    
    public static boolean verificarDia(int dia)
    {
        boolean valido;
        if (dia>=1 && dia <=30)
        {
            valido = true;
        }
        else
        {
            valido = false;
        }
        return valido;
    }
    
    public static boolean verificarAnyo(int year)
    {
        boolean valido;
        if (year>=1900)
        {
            valido = true;
        }
        else
        {
            valido = false;
        }
        return valido;
    }
    
    public static boolean verificarMes(int month)
    {
        boolean valido;
        if (month>0 && month<=12)
        {
            valido=true;
        }
                else
        {
            valido = false;
        }
        return valido;
    }
    public static int pedirValor(String frase)
    {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print(frase);
        valor = sc.nextInt();
        return valor;
    }           

    /**
     * decirme si la fecha es valida o indicarme que 
     * parametro es incorrecto
     * @param validoDia
     * @param validoMes
     * @param validoAnyo 
     */
    public static void mostrarSalida(boolean validoDia, boolean validoMes, boolean validoAnyo) {
        if(validoDia && 
                validoMes &&
                validoAnyo) //validoAnyo==true
        {
            System.out.println("Fecha valida");
        }
        else
        {
            if(validoDia==false)
            {
                System.out.println("Dia incorrecto");
            }
            if(validoMes==false)
            {
                System.out.println("Mes incorrecto");
            } 
            if(!validoAnyo)
            {
                System.out.println("año incorrecto");
            } 
            
        }
    }
    
}
