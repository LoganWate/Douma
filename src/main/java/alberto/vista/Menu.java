package alberto.vista;

import org.gerdoc.model.figura.Figura;

public class Menu {
    public static void principal()
        {
        System.out.println("Welcome");
        System.out.println("----------------------------------------------------");
        System.out.println("Seleccione una opcion");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Equilatero");
        System.out.println("4.- Isosceles");
        System.out.println("5.- Escaleno");
        System.out.println("6.- Pentagono");
        System.out.println("7.- Hexagono");
        System.out.println("8.- Octagono");
        System.out.println("9.- Circulo");
        System.out.println("10.- Salir");
        System.out.println("----------------------------------------------------");
    }

    public static void opcionInvalida(){
        System.out.println("Opcion invalida");
    }
    public static void print(Figura figura)
    {
        System.out.println("El perimetro es: "+figura.perimetro());
        System.out.println("El area es: "+figura.area());
        System.out.println("----------------------------------------------------");
    }

    public static void principal2()
    {
        System.out.println("Welcome");
        System.out.println("Selecciona una opcion");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void menuLado( )
    {
        System.out.println("Dame un lado");
    }

    public static void menuBase( )
    {
        System.out.println("Dame una base");
    }

    public static void menuAltura( )
    {
        System.out.println("Dame una altura");
    }

    public static void menuLado1( )
    {
        System.out.println("Dame lado 1");
    }

    public static void menuLado2( )
    {
        System.out.println("Dame lado 2");
    }

    public static void menuLado3( )
    {
        System.out.println("Dame lado 3");
    }

    public static void menuApotema(){
        System.out.println("Dame el apotema");
    }

    public static void menuRadio(){
        System.out.println("Dame el radio");
    }
}
