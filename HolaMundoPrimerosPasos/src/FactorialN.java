public class FactorialN {
    public static void mostrarFactorial(int n){
        String factorialCadena = "";

        for(int i =0;i<n;i++){
            if(i<(n-1)){
                factorialCadena = "*"+(i+1)+factorialCadena;
            }else{
                factorialCadena = (i+1)+factorialCadena;

            }

        }

        System.out.println("El factorial de "+ n+"!= "+factorialCadena+" = "+calcularFactorial(n));


    }
    public static long calcularFactorial(long n){

        long number =1 ;

        if(n>0){
            number *= n*calcularFactorial(n-1);
        }
        return number;
    }
}
