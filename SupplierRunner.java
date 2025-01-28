@FunctionalInterface
interface Supplier<T>{
    T get();
}

public class SupplierRunner{
    public static void main(String[] arg){

        Supplier<String> sup = () -> "madhu";
        System.out.println(sup.get());
    }
}