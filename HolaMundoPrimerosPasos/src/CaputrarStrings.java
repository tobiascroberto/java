import java.util.Scanner;

public class CaputrarStrings {
    public static void obtenerNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre para saludarte");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa tu edad ");
        int edad = teclado.nextInt();
        System.out.println("Saludos "+nombre+"! de "+edad+" Bienvenido!");

        System.out.println("fin del programa");
    }
}
