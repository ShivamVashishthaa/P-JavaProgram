import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P21FirstRepeatedCharInString {

    public static void main(String[] args) throws InterruptedException {
        String str1 = "Prpogramming java";
        String str = str1.replaceAll("\\s+", "").toLowerCase();

        System.out.println(str);
        System.out.println("method 1 =========================");

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("first non repeated character is " + i + "  : " + str.charAt(i));
                break;
            }
        }

        System.out.println("method 2 ===============================");

        Map<Character, Long> collect2 = str.chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Character character = collect2.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey())
                .findFirst().get();

        System.out.println(character);

        System.out.println("method 3 ===============================");

        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(collect);
        String string = collect.entrySet().stream().filter(entry -> entry.getValue() == 1).map(e -> e.getKey())
                .findFirst().get();

        System.out.println(string);
    }
}
