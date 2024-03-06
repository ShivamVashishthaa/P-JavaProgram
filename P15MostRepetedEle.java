import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P15MostRepetedEle {
    public static void main(String[] args) {
        Integer arr[] = {1,1,1,2,4,4,5,6,7,7,8,6,5,4,3,5,5,6};

        List<String> list = List.of("shivam", "java", "java", "shivam", "java", "shivam", "shivam", "shivam", "shivam");
        

        // for Integer
        List<Integer> listarr = Arrays.asList(arr);

        Map<Integer, Long> collect = listarr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(collect);

        Entry<Integer, Long> entry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        
        System.out.println(entry);


        // for string
        Map<String, Long> collect1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(collect1);

        Entry<String, Long> entry1 = collect1.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        
        System.out.println(entry1);
    }
}
