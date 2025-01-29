import java.util.Optional;

public class OptionalWithMethods {
    public static void main(String[] args){
        Optional<String> op = Optional.of("washington");

        op.filter(name -> name.length() > 5)
        .map(name -> name.toUpperCase())
        .ifPresent(name -> System.out.println(name));


        
    }    
}
