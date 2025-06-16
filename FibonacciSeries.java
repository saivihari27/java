import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        //Java 8

        String fbSeries = Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]}).limit(10)
                .map(m -> m[0]).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Fibonacci Series "+fbSeries);

        //Normal Form

        int n = 10;

        int a = 0, b = 1;
        System.out.print("Fibonacci Series "+a+","+b);
        for(int i = 0 ;i<=n; i++){
            int next = a + b;
            System.out.print(","+next);
            a = b;
            b = next;
        }
    }
}
