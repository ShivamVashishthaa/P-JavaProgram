import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P19FindStringStartWithNum {
    public static void main(String[] args) {
        String [] strarr  = {"one","2two", "three", "4four", "five"};
        List<String> collect = Arrays.stream(strarr).filter(e-> Character.isDigit(e.charAt(0))).collect(Collectors.toList());
        System.out.println(collect);
    }
}
