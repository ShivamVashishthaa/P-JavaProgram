import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P14SecondLargestNum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int temp = 0;
        // bubble sorted

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);



        // find 2nd greatest and smallest number in array-----------------
        List<Integer> intStream = Arrays.asList(arr);

        Integer integer = intStream.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(integer);

        Integer b =
        list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(b);
        Integer c =
        list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(c);
    }

}
