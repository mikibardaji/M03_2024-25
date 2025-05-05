/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author mabardaji
 */
public class calculoIMC {
    
    public double IMCCalc(double heigt, double weight)
    {
        double IMC = weight / (heigt*heigt);
        return IMC;
    }
    
}
