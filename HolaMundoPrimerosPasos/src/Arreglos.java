public class Arreglos {
    public static void usarArreglos(){
        int[] arregloNumeros = new int[15];
        for(int i = 1; i<= arregloNumeros.length;i++){
            arregloNumeros[(i-1)] = i*i;
        }
        int contador =1;
        for(int x: arregloNumeros){
            System.out.println("El elemeto "+contador+": "+x);
            contador++;
        }

    }
}
