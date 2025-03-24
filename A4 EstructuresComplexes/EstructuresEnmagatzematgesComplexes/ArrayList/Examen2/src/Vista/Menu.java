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
import java.util.*;
import java.lang.StringBuilder;

public class Menu {
  // jere
  private String titol;
  // jere
  private ArrayList<String> opcions;

  // jere
  public Menu(String titol) {
    this.titol = titol;
    this.opcions = new ArrayList<String>();
  }


  public Menu(String titol, boolean exit) {
    this.titol = titol;
    this.opcions = new ArrayList<String>();
    if (exit) {
      this.opcions.add("Salir");
    }
  }

 
  public void getTitol() {
    System.out.println(this.titol);
  }


  public void setTitol(String titol) {
    this.titol = titol;
  }

 
  public boolean addOption(String opcio) throws OptionDuplicateException {
    if (opcions.contains(opcio)) {
      throw new OptionDuplicateException();
    } else {
      return opcions.add(opcio);
      /* System.out.println("Se ha añadido la opción: " + opcio); */
    }
  }


  public boolean addOptionWithRepetition(String opcio) {
    return opcions.add(opcio);
  }

 
  public void addOptionByIndex(int index, String opcio) {
    opcions.add(index, opcio);
  }

 
  public boolean removeOption(String opcio) {
    return opcions.remove(opcio);
  }

 
  public String removeOptionByIndex(int opcio) {
    return opcions.remove(opcio);

  }

 
  public int numeroOptionsMenu() {
    return opcions.size();
  }


  public String toString() {
    // Part 1: create a new StringBuilder.
    StringBuilder builder = new StringBuilder();
    builder.append(titol + "\n");
    builder.append("--------------\n");
    for (int i = 0; i < opcions.size(); i++) {
      builder.append(i + ". ").append(opcions.get(i)).append("\n");
    }
    String result = builder.toString();
    // ... Print result.
    return result;
  }


  public void displayMenu() {
    System.out.println(this); //crida al toString
  }

  
  public int chooseOption() {
    Scanner sc = new Scanner(System.in);
    int opcion = -1;
    do {
      System.out.println("Introduce una opción: ");
      opcion = sc.nextInt();
      if (opcion >= opcions.size() || opcion < 0) {
        System.out.println("Opcion no valida, vuelve a escoger");
      }
    } while (opcion >= opcions.size() || opcion < 0);

    //System.out.println(opcions.get(opcion));

    return opcion ;
  }

  /*
   * public String chooseOption() {
   * Scanner sc = new Scanner(System.in);
   * int opcion = -1;
   * do {
   * System.out.println("Introduce una opción: ");
   * opcion = sc.nextInt();
   * if (opcion >= opcions.size() || opcion < 0) {
   * System.out.println("Opcion no valida, vuelve a escoger");
   * }
   * } while (opcion >= opcions.size() || opcion < 0);
   * 
   * System.out.println(opcions.get(opcion));
   * 
   * return opcions.get(opcion);
   * }
   */


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu other = (Menu) obj;
    return Objects.equals(this.titol, other.titol);
  }
}
