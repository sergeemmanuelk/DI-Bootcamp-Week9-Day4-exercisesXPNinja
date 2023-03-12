import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        // Using distinct() method to copy distinct values to a new list
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);

    }
}