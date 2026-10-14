import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistinctNumber {
    public static void main(String[] args) {
        List<Integer> numbers =
    Arrays.asList(1, 2, 3, 2, 4, 3, 5, 2);


    Integer result=numbers.stream()
    .distinct()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .orElse(null);

    System.out.println(result);
                
    }
}
