import java.util.Arrays;
import java.util.List;

public class WordSum {

    public static void main(String[] args) {

        String[] str = {"Apple", "Banana", "Papaya", "Grapes"};

        List<String> list = Arrays.asList(str);

        int sum = list.stream().mapToInt(m -> m.charAt(0)).sum();

        System.out.println("Sum of first letters in a list of words " + sum);
    }
}
