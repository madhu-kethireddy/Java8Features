import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Predicate<Y> {
    boolean tesy(Y y); 
}

public class MultiLine {
    public static void main(String... args){


        //MultilLine Code Lambd Expressions use curly brackets for multi lines code
        Comparator<String> com = (String s1, String s2) ->{
            if(s1.length() < s2.length()){
                return -1;
            }else if(s1.length() > s2.length()){
                return 1;
            }else{
                return 0;
            }
        };
        
        //Single Line Code by Lambda Expression no need of curly brackets
        Comparator<String> comp = (String s1, String s2) -> s1.length() - s2.length();

        //Single Line code by Lambda Expression no need of primitive Data Types
        Comparator<String> comp1 = (s1,s2) -> s1.length() - s2.length();
    

        List<String> lst = Arrays.asList("abcds","dodewwe", "edoi", "dijwwsek", "oiiws","ew3","2", "e3");
        System.out.println(lst);
        Collections.sort(lst, comp1);
        System.out.println(lst);

        //No Returns Method by lambda expression using following syntax;
        Runnable run = () -> System.out.println("Hello, World!");
        System.out.println(run);


        //One argument with return value using lambda expression
        Predicate<Integer> isPositive = y -> y > 0;
        System.out.println(isPositive.tesy(-21));


        
    }
}
