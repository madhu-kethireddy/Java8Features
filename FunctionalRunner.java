import java.util.List;

interface Madhuable {
    void min(int[] array);
}

public class FunctionalRunner {
    public static void main(String[] args){
        List<String> list = List.of("amd", "balu","ship", "shallow");
        System.out.println(list);

        int[] arr = {2,3,5,3,2,1};

        Madhuable mad = (array) -> {
            int result = array[0];
            for(int i=0; i<array.length; i++){
                if(result>array[i]){
                    result = array[i];
                }   
            }
            System.out.println(result);
        };
        mad.min(arr);
        
        

    }
}   
