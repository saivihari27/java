import java.util.stream.IntStream;

public class PrintFirstNaturalNumbers {

    public static void main(String[] args) {

        // Java 8

        int n = 10;

        IntStream.range(1,n+1).forEach(System.out::println);

        System.out.println();
        //Normal Form

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
