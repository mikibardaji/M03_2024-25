
package Objetos;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol implements Persona {
    protected int id;
    protected String nombre;
    protected int edad;
    protected double salario;
    private final double SALARIO_MINIM;

    public EquipoFutbol(int id, String nombre, int edad, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        SALARIO_MINIM = salario;
        this.salario = SALARIO_MINIM;
    }

    public void concentrarse() {
        //perque el codi és el mateix per tots
        System.out.println(nombre + " hem concentro a l'hotel");
    }

    public void viajar() {
        System.out.println(nombre + " viatjo al partit. ");
    }

    @Override
    public void saludar() {
        System.out.println("Hola que tal estas?, jo em dic " + nombre);
    }
    
    public abstract void diaPartido();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EquipoFutbol)) {
            return false;
        }
        final EquipoFutbol other = (EquipoFutbol) obj;
        if (this.id == other.id)
        {
            return true;
        }
        else
        {
            return this.nombre.equalsIgnoreCase(other.nombre);
           
//            boolean cierto = this.nombre.equalsIgnoreCase(other.nombre)?return true:false;
//            return cierto;
//            if (this.nombre.equalsIgnoreCase(other.nombre)?ret)
//            if (this.nombre.equalsIgnoreCase(other.nombre))
//            {
//                return true;
//            }
//            else
//            {
//                return false;
//            }
        }
      
    }

    @Override
    public String toString() {
        return nombre + " tiene la id federativa=> " + id;
    }
           
}


