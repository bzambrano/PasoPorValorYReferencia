package PasoPorRef;

public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "Bryhan";
        this.apellido = "Zambrano";
        this.edad = 30;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
