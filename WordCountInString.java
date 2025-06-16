import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountInString {

    public static void main(String[] args) {

        String word = "Hello Java";
        String updatedString = word.replace(" ", "");

        Map<Character, Integer> maps = new HashMap<>();

        for(int i = 0; i<updatedString.length();i++){
            char c = updatedString.charAt(i);
            if(!maps.containsKey(c)){
                maps.put(c,1);
            }
            else {
                maps.put(c, maps.get(c)+1);
            }
        }
        int sum = maps.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        maps.entrySet().forEach(k-> System.out.println(k.getKey()+" count is "+k.getValue()));

        // Java 8
        Map<Character, Long> collect = updatedString.chars().mapToObj(m -> (char)m).collect(Collectors.groupingBy(
                g -> g,
                Collectors.counting()
        ));

        collect.entrySet().forEach(System.out::println);
    }
}
