import java.util.Arrays;
import java.util.List;

public class GetInFirstLetterInList {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,45,56,28,76,245,43,22);

        List<String> list = numbers.stream().map(String::valueOf).toList();


        System.out.println(list);

        List<Integer> list1 = list.stream().filter(m -> m.startsWith("2")).map(Integer::parseInt).toList();
        System.out.println(list1);
        sumOfIntegers(list1);
    }

    public static void  sumOfIntegers(List<Integer> integers){
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
