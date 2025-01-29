import java.util.Map;
import java.util.TreeMap;

public class MapSpecialMethods {
    public static void main(String... c){


        String[] names = {"ramu","madhu","rahul","rahul","madhu","ramu", "ramu"};
        Map<String, Integer> students = new TreeMap<>();

        for(String name: names){
            students.merge(name,1, (before, after) -> before+after);
        }

        students.forEach((name, count) -> System.out.println(name+": "+count));
        

        for(String name: names){
            students.compute(name, (key, count) -> count == null ? 1 : count+1);
        }

        students.forEach((name, count) -> System.out.println(name+"= "+count));

    }
}
