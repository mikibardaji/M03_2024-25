/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

public class Masajista extends EquipoFutbol {
    private String titulacionAcademica;

    public Masajista(int id, String nombre, int edad, String titulacionAcademica) {
        super(id, nombre, edad, 500);
        this.titulacionAcademica = titulacionAcademica;
    }

    public Masajista(int id, String nombre) {
        super(id, nombre, 30, 500);
        this.titulacionAcademica = "Titulo de masajista especializado";
    }    
    public void darMasaje() {
        System.out.println(nombre + " estÃ  donant un massatge.");
    }

    @Override
    public void diaPartido() {
          System.out.println("si és lesiona algú saltare al camp");
    }

    public String getTitulacionAcademica() {
        return titulacionAcademica;
    }


}
