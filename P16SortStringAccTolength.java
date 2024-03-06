import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P16SortStringAccTolength {
    public static void main(String[] args) {
        String [] arr = {"a", "bb", "cccc", "dddd"};
        List<String> list = Arrays.asList(arr);

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
