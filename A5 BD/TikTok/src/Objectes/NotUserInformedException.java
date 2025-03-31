/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author mabardaji
 */
public class NotUserInformedException extends Exception{

    public NotUserInformedException() {
        super("Debes informar usuario");
    }

    public NotUserInformedException(String user) {
        super("El usuario tiene que tener 4 caracteres , tu user es " + user);
    }
    
    
    
}
