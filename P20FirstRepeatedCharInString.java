import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P20FirstRepeatedCharInString {

    public static void main(String[] args) {
        String str1 = "programming java";
        String str = str1.replaceAll("//s+", "").toLowerCase();

        System.out.println(str);
        System.out.println("method 1 =========================");

        boolean found = false;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i));
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        System.out.println("method 2 ===============================");

        HashSet<Character> hashSet = new HashSet<>();
        Character character = str.chars().mapToObj(e -> (char) e).filter(e -> !hashSet.add(e)).findFirst().get();
        System.out.println(character);

        System.out.println("method 3 ===============================");

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
                System.out.println(collect);
        String string = collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(e -> e.getKey())
                .findFirst().get();

        System.out.println(string);
    }
}
