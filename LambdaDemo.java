@FunctionalInterface
interface IntFun {
    int calc(int n); 
}

public class LambdaDemo {

    public static int arraySumByFunc(int[] arr, IntFun fun){
        int sum = 0;
        for(int i: arr){
            sum += fun.calc(i);
        }
        return sum;
    }
    

    public static void main(String[] a){
        

        int []ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arraySumByFunc(ar, x -> x));
        System.out.println(arraySumByFunc(ar, x -> x+1));
        System.out.println(arraySumByFunc(ar, x -> x*x));
        System.out.println(arraySumByFunc(ar, x -> x%2));
        System.out.println(arraySumByFunc(ar, x -> x>3?x:0));
        System.out.println(arraySumByFunc(ar, x -> x/3));
    }
}
