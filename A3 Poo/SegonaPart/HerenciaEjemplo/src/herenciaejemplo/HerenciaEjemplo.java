/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejemplo;

import Objetos.Alumno;
import Objetos.Persona;
import Objetos.Profesor;
import Objetos.Vida;

/**
 *
 * @author mabardaji
 */
public class HerenciaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona people = new Persona("nombre", 10, 10, Vida.VIVO);
        people.setNombre("ROSER");
        people.setDNI(1);
        System.out.println("persona " + people.getNombre() + " dni " + people.getDNI());
        Alumno student = new Alumno("nombre", 20, 10, Vida.VIVO, "DAW", 1);
        student.setNombre("Jose Luis");
        student.setDNI(2);
        System.out.println(people);
        people.respira();
        System.out.println(student);      
        student.respira();
        System.out.println("Los mato... ");
        people.morir();
        student.morir();
        System.out.println(people);
        people.respira();
        System.out.println(student);      
        student.respira();
        Profesor teacher = new Profesor("Bardaji", 100, 100, Vida.VIVO, "M485 Programacion");
        System.out.println(teacher);
        teacher.respira();
    }
    
}
