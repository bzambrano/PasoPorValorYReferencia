public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("El valor de la variable es; "+x);
        cambiarValor(x);
        System.out.println("El valor de la variable es; "+x);

    }

    private static void cambiarValor(int arg) {
        arg=20;
        System.out.println("El valor de la variable es; "+arg);

    }
}
 //prueba de cambio en git 