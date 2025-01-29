import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionForEach{
    public static void main(String[] args){
        Collection<String> names = new ArrayList<>(List.of("mario", "luigi", "john", "polard", "pandya"));
        

        //Imperative Style
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("---------------------");

        //Functional Style
        names.forEach(name -> System.out.println(name));
        
        System.out.println("************************");
        //Method References
        names.forEach(System.out::println);
    }
}