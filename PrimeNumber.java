import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 13;
        boolean isPrimeNumber;
        isPrimeNumber = IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);

        if(isPrimeNumber)
            System.out.println("The given number is Prime Number");
        else
            System.out.println("The given number is NOT Prime Number");

        // Normal form

        if(n<=1)
            isPrimeNumber = false;

        for(int i =2; i<=n/2; i++){
            if(n % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        if(isPrimeNumber)
            System.out.println("The given number is Prime Number");
        else
            System.out.println("The given number is NOT Prime Number");



    }
}