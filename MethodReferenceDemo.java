import java.util.function.IntPredicate;

public class MethodReferenceDemo {

    private static int sum(int[] nums, IntPredicate func){
        int result = 0;
        for(int i: nums){
            if(func.test(i)){
                result += i;
            }
        }
        return result;
    }

    public static void main(String []a)
    {
        int[] arr = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        System.out.println(sum(arr, ExpressionHelper::isEven));
        System.out.println(sum(arr, ExpressionHelper::isPositive));

        

    }
}
