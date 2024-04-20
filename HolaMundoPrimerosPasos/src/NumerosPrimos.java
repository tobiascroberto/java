public class NumerosPrimos {
    public static void darNumerosPrimos(int n){

        String cadenaNumerosPrimos="";
        int contador =1;
        int numero = 1;
        while(contador<=n){
            if(esPrimo(numero)){
                cadenaNumerosPrimos += contador + ": " + numero + "\n";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros "+n+" números primos son: \n"+cadenaNumerosPrimos);
    }
    public static boolean esPrimo(int n){
        boolean esNumeroPrimo = true;
        for(int i=2; i<n;i++){
            if(n%i==0){
                esNumeroPrimo=false;
                break;
            }
        }
        return esNumeroPrimo;
    }
}
