package PasoPorRef;

public class Persona {
    public String name;
    public String apellido;
    public int edad;

    public Persona() {
        this.name = "Silvestre";
        this.apellido = "Dangond";
        this.edad = 30;
    }

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }


    public void changeNamePerson(String newName) {
        this.name =newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
