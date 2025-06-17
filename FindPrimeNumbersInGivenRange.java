

public class FindPrimeNumbersInGivenRange {

    public static void main(String[] args) {

        int target = 10;

        for(int i = 2; i<= target; i++){
            if(isPrimeNumber(i)) {
                System.out.println(i+" ");
            }
        }
    }

    private static boolean isPrimeNumber(int number){

        if(number <= 1)
            return false;

        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
