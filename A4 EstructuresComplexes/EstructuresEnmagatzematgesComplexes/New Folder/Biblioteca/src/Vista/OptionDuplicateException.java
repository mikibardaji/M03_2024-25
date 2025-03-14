/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author usuari
 */
public class OptionDuplicateException extends Exception {
  public OptionDuplicateException() {
    super("La opción ya existe");
  }

}