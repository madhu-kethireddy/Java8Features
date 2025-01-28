import java.util.function.IntPredicate;

public class InstanceMethodDemo {
    private static int sum(int []nums, IntPredicate func){
        int result = 0;
        for(int v: nums){
            if(func.test(v)){
                result += v;
            }
        }
        return result;
    }

    public static void main(String []args){
        int []array = {4, 5, 3, 2, 8, 5, 9, 1, 0, 1};
        InstanceHelper helper = new InstanceHelper();
        System.out.println(sum(array, helper::isOdd));
    }
    
}
