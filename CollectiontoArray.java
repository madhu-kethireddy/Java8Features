import java.util.Arrays;
import java.util.Collection;

public class CollectiontoArray {
    public static void main(String []ar){
        Collection<String> names = Arrays.asList("Mnemonic", "Deckard", "Flynn");

        // Functional style
        String []array = names.toArray(size -> new String[size]);
        System.out.println(array.length);

        //Method References
        String[] array1 = names.toArray(String[]::new);
        System.out.println(array1.length);
    }
}
