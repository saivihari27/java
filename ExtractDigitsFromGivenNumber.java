import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExtractDigitsFromGivenNumber {

    public static void main(String[] args) {

        int number = 36578;
        int m = 0;
        String str = String.valueOf(number);

        //int sum = s.chars().map(Character::getNumericValue).sum();

        int sum = IntStream.range(0, str.length()).map(it -> Character.getNumericValue(str.charAt(it))).sum();
        System.out.println(sum);

        // Normal method

        while (number > 0){
            int singleDigit = number % 10;
            System.out.println(singleDigit);
            m = m+singleDigit;
            number = number / 10;
        }
        System.out.println(m);


        // Using For-loop

        int y = 0;
        for(int i = 0; i < str.length(); i++){
            int digit = Character.getNumericValue(str.charAt(i));
            System.out.println(digit);
            y = y + digit;
        }
        System.out.println(y);
    }

}
