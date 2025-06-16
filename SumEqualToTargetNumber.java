import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumEqualToTargetNumber {

    public static void main(String[] args) {

        int target = 10;

        int[] arr = {1,2,3,4,5,6,7,8};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        List<Integer> intList = Arrays.stream(arr).boxed().toList();

        Set<Set<Integer>> collect = intList.stream().flatMap(f -> intList.stream().filter(j -> f < j && f + j == target)
                .map(m -> Set.of(f, m))).collect(Collectors.toSet());

        System.out.println(collect);
    }
}
