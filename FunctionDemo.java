import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args){
        Function<String, Integer> toInteger = FunctionDemo::parse;
        int value = toInteger.apply("6");
        System.out.println("Interger = "+value);

    }
    public static Integer parse(String s){
        return Integer.parseInt(s);
    }
}
