import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRep {
    public static void main(String[] args) {
        

        String str = "swiss";


        Map<Character,Long> result=str.chars()
         .mapToObj(n->(char)n)
        //  .filter(n->str.indexOf(n) == str.lastIndexOf(n))
        //  .findFirst()
        //  .orElse(null);
        .collect(Collectors.groupingBy(

         n->n,
         LinkedHashMap::new,
         Collectors.counting()
        ));

        Character first=result.entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
       .map(Map.Entry::getKey)
       .findFirst()
        .orElse(null);

System.out.println(first);

         
    }
}
