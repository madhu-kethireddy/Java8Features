import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String args[]){

        List<String> states  = new ArrayList<>(List.of(
            "Andhra Pradesh", "Tamil Nadu", "Kerala", "Goa", "Karnataka", "Maharashtra", "Madhya Pradesh"
        ));

        // states.forEach(System.out::println);
        states.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(0)<s2.charAt(0)){
                    return -1;
                }else if(s1.charAt(0)>s2.charAt(0)){
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        states.sort((s1, s2) ->{
                if(s1.charAt(0)<s2.charAt(0)){
                    return -1;
                }else if(s1.charAt(0)>s2.charAt(0)){
                    return 1;
                }else{
                    return 0;
                }
        });

        states.sort((s1,s2) -> s1.length()<s2.length()?-1:s1.length()>s2.length()? 1:0);

        states.sort((s1,s2) -> s1.length() - s2.length());

        states.sort((s1, s2) -> Integer.valueOf(s1.length()).compareTo(Integer.valueOf(s2.length())));

        states.sort((s1, s2) -> Integer.compare(s1.length(),(s2.length())));

        states.sort(Comparator.comparingInt(s -> s.length()));
        states.forEach(System.out::println);
    }
}
