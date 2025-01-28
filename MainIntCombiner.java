
public class MainIntCombiner{
    public static void main(String[] a){

        IntCombiner<Integer> intCombiner = (c, b) -> c + b;
        int[] arr = {32, 43, 23, 42, 5,6, 2};
        int result = intCombiner.combineArray(arr);
        System.out.println(result);
        
    }
}