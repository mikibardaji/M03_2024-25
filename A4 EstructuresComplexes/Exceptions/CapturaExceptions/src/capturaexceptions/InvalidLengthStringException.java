/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package capturaexceptions;

/**
 *
 * @author mabardaji
 */
public class InvalidLengthStringException extends Exception{


    public InvalidLengthStringException() {
        super("La longitud no es correcta");
    }

    
    public InvalidLengthStringException(String msg) {
        super(msg);
    }
}
