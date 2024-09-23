/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradolado5;

/**
 *
 * @author mabardaji
 */
public class CuadradoLado5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro variable
        int lado = 5;
        // Ctrl + Mayus + C comentar varias linea de golpe
//        int lado2;
//        lado2 = 5;
        int perimetro,area; //defino nombre y tipo
        perimetro = lado +lado + lado + lado; //asigno con operacion
        area = lado * lado;
        System.out.println("La area del cuadradado es " + area);
        System.out.println("El perimetro es " + perimetro + " metros");
    }
    
}
