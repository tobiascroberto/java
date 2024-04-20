import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListas {

    // agregar cadena de nombre y correo en un array sin determinar el tamaño del array

    public static void addNombre(){

        Scanner teclado = new Scanner(System.in);
        int resp = 0;
        int contador = 0;
        String nombre;
        String email;
        ArrayList<information> myInformacion = new ArrayList<>();
        System.out.println("Programa para almacenar nombre y correo electronico");
        while(!(resp==-1)){
            contador++;
            System.out.println("Persona #"+contador+": favor de ingresa el nombre.");
            nombre = teclado.nextLine();
            System.out.println("Persona #"+contador+": favor de ingresa el correo electronico.");
            email = teclado.nextLine();
            myInformacion.add(new information(nombre,email));
            System.out.println("¿Deseas agregar otra pesona?: -1:salir 1:continuar");
            resp= teclado.nextInt();
            teclado.nextLine();
        }

        // muestra el contenido de la base

        contador = 0;
        for (information usuario: myInformacion){
            contador++;
            System.out.println("Usuario #"+contador+"\n Nombre: "+usuario.getNombre() +" \n Email: "+usuario.getEmail());
        }

    }

    public static class information{
        private String nombre;
        private String email;

        public information(String nombre, String email){
            this.nombre=nombre;
            this.email=email;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
