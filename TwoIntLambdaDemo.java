@FunctionalInterface
interface TwoIntFunc {
    void doCalc(int a, int b); 
}

public class TwoIntLambdaDemo {
    public static void main(String[] a){

        TwoIntFunc twoIntFunc = (num1, num2) ->{
            num1++;
            int result = num1 * num2;
            System.out.println("Result of passed argument " + result);
        };
        
        twoIntFunc.doCalc(2, 07);

    }
}
