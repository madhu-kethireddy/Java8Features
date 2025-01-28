import java.util.Arrays;

@FunctionalInterface
interface IntCombiner<E> {
    int combine(int a, int b);
    
    
    private int combineAll(int a, int b, int... other){
        int result = combine(a, b);
        for(int i: other){
            result = combine(result,i);
        }
        return result;
    }

    static IntCombiner<Integer> sum(){
        return new IntCombiner<Integer>() {
            @Override
            public int combine(final int a, final int b){
                return a + b;
            }
        };
    }


    default int combineArray(int[] array){
        int result = 0;
        if(array.length == 1){
            result = array[0];
        }else if(array.length == 2){
            result = combine(array[0], array[1]);
        }else if(array.length >2){
            result = combineAll(array[0], array[1], Arrays.copyOfRange(array, 2, array.length));
        }
        return result;      
    }
}
