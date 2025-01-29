import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListAndMapreplaceAll 
{
    public static void main(String[] args){

        List<String> names = new ArrayList<>(List.of(
            "madhu kethireddy",
            "rajesh kondi",
            "puneeth airtel"
        ));

        names.replaceAll(name -> name.split(" ")[0]);
        names.forEach(System.out::println);

        Map<String, String> details = new LinkedHashMap<>(Map.of(
            "madhu", "kethireddy",
            "rajesh", "kondi",
            "puneeth", "airtel"
        ));

        details.replaceAll((fname, lname) -> lname.charAt(0)+fname);
        details.forEach((fname, lname) -> System.out.println(lname));
        

    }
}

    