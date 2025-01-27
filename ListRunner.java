import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListRunner{
    public record Person(String firstName, String lastName, int age) {
    }
    public static void main(String[] args){

        List<Person> person = Arrays.asList(
            new Person("kethireddy", "madhu", 23),
            new Person("kethireddy", "lavanya", 25),
            new Person("somu","Mario", 26)
        );

        List<String> lastNames = person.stream()
        .filter(p -> "somu".equals(p.firstName()))
        .map(p -> p.lastName())
        .collect(Collectors.toList());


        lastNames.forEach(lastName -> System.out.println(lastName));

        // List<String> lastNames = new ArrayList<>();
        // for(Person p: person){
        //     if("kethireddy".equals(p.firstName())){
        //         String lastName = p.lastName();
        //         lastNames.add(lastName);
        //     }
        // }

        // for(String lName: lastNames){
        //     System.out.println(lName);
        // }
        
    }
}