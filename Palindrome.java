import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Markram";

        String lowerCaseStr = str.toLowerCase();

       List<String> strList = List.of(lowerCaseStr);
//
//        //Java 8

        String reverse = IntStream.iterate(lowerCaseStr.length() - 1, i -> i >= 0, i -> i - 1).mapToObj(m -> Character.toString(lowerCaseStr.charAt(m)))
                .collect(Collectors.joining());

        System.out.println(reverse);

        if(lowerCaseStr.equals(reverse))
            System.out.println("The given string is Palindrome");
        else
            System.out.println("The given string is NOT Palindrome");


        //Normal form

        String str2 = new StringBuilder(lowerCaseStr).reverse().toString();

        if(lowerCaseStr.equals(str2))
            System.out.println("The given string is Palindrome");
        else
            System.out.println("The given string is NOT Palindrome");

    }
}
