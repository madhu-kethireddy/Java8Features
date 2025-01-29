import java.util.Optional;

public class OptionalWithMethods {
    public static void main(String[] args){
        Optional<String> op = Optional.of("naresh");

        op.filter(name -> name.length() > 5)
        .map(name -> name.toUpperCase())
        .ifPresent(name -> System.out.println(name));
       
        System.out.println(op.get());
        System.out.println(op.orElse("kethireddy"));
        System.out.println(op.orElseGet(() -> "madhu"));
        System.out.println(op.orElseThrow(() -> new IllegalStateException()));

    }    
}
