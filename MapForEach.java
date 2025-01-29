
import java.util.Map;

public class MapForEach {
    public static void main(String []a){

        Map<String, Integer> details = Map.of(
            "madhu",23,
            "reethu", 32,
            "arjun", 25,
            "joe", 17
        );

        //Imperative Style
        for(Map.Entry<String, Integer> detail: details.entrySet()){
            String name = detail.getKey();
            int age = detail.getValue();
            System.out.println(name+" = "+age);
        }


        //Functional Interface
        details.forEach((name, age) -> System.out.println(name + ": "+age));
        
    }
}
