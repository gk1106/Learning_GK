
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Duplicate {
    
    public static void main(String[] args) {
        
        String str = "programming";

//         Map<Character,Integer> result=new TreeMap<>();
// //using for each loop

//         for(Character s:str.toCharArray() ){

//             result.put(s,result.getOrDefault(s,0)+1);
//         }

Map<Character,Long> result=str.chars()
                             .mapToObj(c->(char)c)
                             .collect(Collectors.groupingBy(

                             n->n,
                             TreeMap::new,
                            
                             Collectors.counting()
                             ));

                             result.entrySet().stream()
                             .filter(entry-> entry.getValue() >1)
                             .forEach(entry->
                             System.out.println(entry.getKey() +"= "+entry.getValue())
                             );


        //System.out.println(result);

                                      
    }
}
