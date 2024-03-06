import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P13SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        // int sum = 0;
        
        // String str = Integer.toString(number);
        // String numArr[] = str.split("");
        // System.out.println("length : " + str.length());

        // for (int i = 0; i < numArr.length; i++) {
        //     int num = Integer.parseInt(numArr[i]);
        //     sum += num;   
        // }
        // System.out.print("sum of the give number is " + sum);


        Integer collect = Stream.of(String.valueOf(number).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collect);
    }
}
