
import java.util.HashMap;

public class Dup{
    public static void main(String[] args) {
        //effective approch 
        String name="programming";

        HashMap<Character,Integer> countMap=new HashMap<>();
        HashMap<Character,Integer> duplicateMap=new HashMap<>();

        for(int i=0;i<name.length();i++){

            char ch=name.charAt(i);

            countMap.put(ch,countMap.getOrDefault(ch, 0)+1);
        }

        for(char ch:countMap.keySet()){
        if(countMap.get(ch) > 1){

       duplicateMap.put(ch,countMap.get(ch));

        }

        }

        System.out.println(countMap);

         System.out.println(duplicateMap);


    }
}