import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionRemoveIf {
    public static void main(String[] args){
        Collection<String> strs = new ArrayList<>(Arrays.asList(
            "madam", "damn", "short", "twelve", "dam"
        ));

        //Functional style
        strs.removeIf(str -> !str.contains("dam"));
        strs.forEach(System.out::println);
    
        System.out.println("++++++++++");
        //Imperative style
        Iterator<String> it = strs.iterator();
        while (it.hasNext()) {
            if(it.next().contains("dam")){
                it.remove();
            }
        }
        for(String item: strs){
            System.out.println(item);
        }
        System.out.println("Good Bye!");
    
    
    }


}
