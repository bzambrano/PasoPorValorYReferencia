package PasoPorRef;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        CambiarNombrePersona(p1);
        System.out.println(p1.toString());
    }


    private static void CambiarNombrePersona(Persona persona) {
        persona.nombre = "Juan";
    }


}
