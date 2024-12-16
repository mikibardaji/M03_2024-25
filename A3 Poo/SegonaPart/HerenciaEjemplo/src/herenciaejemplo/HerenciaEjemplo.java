/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejemplo;

import Objetos.Alumno;
import Objetos.ObjetoDani;
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
        Persona p1 = new Persona("per1", 10, 10, Vida.VIVO);
        Alumno al1 = new Alumno("n1", 11, 11, Vida.VIVO, "DAW", 1);
        Profesor pr1 = new Profesor("pr1", 20, 20, Vida.VIVO, "M0485");
        p1.respira();
        System.out.println("-p1--");
        al1.respira();
        System.out.println("----");
        pr1.respira();
        System.out.println("----");
        
        p1 = new Alumno("al2", 30, 30, Vida.VIVO, "DAW", 2);
        p1.respira();
        System.out.println("-p1--");
        //primeresProves();
        p1 = new Profesor("pr1", 50, 50, Vida.VIVO, "M0485");
        p1.respira();
        System.out.println("-p1--");
        Persona p2;
        System.out.println("p1 nombre " + p1.getNombre());
        p1 = al1;
       System.out.println("p1 nombre" + p1.getNombre());
        ObjetoDani dani = new ObjetoDani();
              
    }

    private static void primeresProves() {
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
