/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

public class President extends EquipoFutbol {

    private int anysEnElCarrec;

    public President(int id, String nombre, int edad, int anysEnElCarrec) {
        super(id, nombre, edad, 10000);
        this.anysEnElCarrec = anysEnElCarrec;
    }
    public President(int id, String nombre) {
        super(id, nombre, 65, 10000);
        this.anysEnElCarrec = 4;
    }
    @Override
    public void viajar() {
        super.viajar();
        System.out.println("Viatjo amb Primera.");
    }

   /* public void irPalcoPartido() {
        System.out.println(nombre + " est‡† al palco del partit.");
    }*/

    public void tratarContrato(EquipoFutbol ex) {
        if (ex instanceof Entrenador) {
            System.out.println("Tenen que millorar el seu joc al proper partit.");
        } else if (ex instanceof Futbolista) {
            System.out.println("Si vols cobrar m·s has de fer gols.");
        } else if (ex instanceof Masajista) {
            System.out.println("Com Ès lesioni alg√∫ et foto fora.");
        } else if (ex instanceof President) {
            System.out.println("Vamos a comer pago yo!!");
        }
    }

    @Override
    public void saludar() {
        System.out.println("Sigueme");
    }

    @Override
    public void diaPartido() {
            System.out.println(nombre + " est‡† al palco del partit.");
    }

    public int getAnysEnElCarrec() {
        return anysEnElCarrec;
    }
    
    
}
