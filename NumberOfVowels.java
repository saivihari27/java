import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class NumberOfVowels {

    public static void main(String[] args) {

        // Normal form
        String str = "Techouts";
        String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};

        char[] charArray = str.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            if (Arrays.asList(vowels).contains(String.valueOf(charArray[i]))) {
                System.out.println(charArray[i] + " is a vowel");
            }
        }

        // Java 8

        System.out.println();
        List<String> list = Arrays.asList(str.split(""));

        List<String> list1 = list.stream().map(m -> Arrays.asList(vowels).contains(m) ? m : null)
                .filter(Objects::nonNull).distinct().toList();
        list1.forEach(f-> System.out.println(f + " is a vowel"));

    }
}
