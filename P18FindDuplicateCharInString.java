import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P18FindDuplicateCharInString {
    public static void main(String[] args) {
        String str = "shivamVahsihtha";
        IntStream chars = str.chars();
        IntStream chars1 = str.chars();


        HashSet<Character> set = new HashSet<>();
        List<Character> collect = chars.mapToObj(e-> (char) e).filter(e -> !set.add(e)).collect(Collectors.toList());
        System.out.println(collect);


        Map<Character, Long> collect2 = chars1.mapToObj(e-> (char) e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect2);
    }   
}
