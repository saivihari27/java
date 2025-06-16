import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Markram";

        String lowerCaseStr = str.toLowerCase();

        List<String> strList = Arrays.asList(lowerCaseStr);

        //Java 8

        List<String> reverselist = strList.stream().sorted(Comparator.reverseOrder()).toList();

        if(strList.equals(reverselist))
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
