package Vista;

public class OptionDuplicateException extends Exception {
  public OptionDuplicateException() {
    super("La opci�n ya existe");
  }

}