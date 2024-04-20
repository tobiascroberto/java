public class fibonacci {
    public static void sucesionFibonacci(int n){
        int a =0;
        int b=1;
        String sucesionFibunacci ="1 ";
        int aux=0;
        for(int i=0; i<n;i++){
            aux = a;
            a=b;
            b=aux+b;
            sucesionFibunacci += b+" ";

        }
        System.out.println("La serie de Fibunacci es "+sucesionFibunacci);
    }
}
