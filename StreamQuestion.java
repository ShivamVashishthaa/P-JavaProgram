import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * StreamQuestion
 */
public class StreamQuestion {

    private static int recursionlimit = 10;

    private static void fibonacci(int n){
        if (recursionlimit > 0) {
            System.out.println(" " + );
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 45, 25);
        List<String> stringlist = Arrays.asList("shivam", "himani", "vinay", "rani", "shivam", "himani", "rani", "vash",
                "vinay", "shivam");

        List<Student> students = List.of(
                new Student(1, "shivam", "BCA"),
                new Student(5, "himani", "BCA"),
                new Student(1, "shivam", "BCA"),
                new Student(6, "shivam", "BCA"),
                new Student(1, "himani", "BCA"));

        // find average-----------------------------------------------------------

        // double b = list.stream().mapToInt(e -> e).average().getAsDouble();
        // System.out.println(b);

        // double b =
        // list.stream().map(e->e*e).filter(e->e<100).mapToInt(e->e).average().getAsDouble();
        // System.out.println(b);

        // find the number strat with 2--------------------------------------------

        // list.stream().map(e->String.valueOf(e))
        // .filter(e->e.startsWith("2"))
        // .map(e->Integer.valueOf(e))
        // .forEach(System.out::println);

        // find the string start and end with----------------------

        // List<String> collect = stringlist.stream().filter(e ->
        // e.startsWith("s")).collect(Collectors.toList());
        // System.out.println(collect);

        // Set<Integer> collect2 = list.stream().filter(e -> Collections.frequency(list,
        // e) > 1).collect(Collectors.toSet());
        // System.out.println(collect2);

        // HashSet<String> hashSet = new HashSet<>();
        // Set<String> collect3 = stringlist.stream().filter(e
        // ->!hashSet.add(e)).collect(Collectors.toSet());
        // System.out.println(collect3);

        // Find max and min in array--------------------------------------

        // int b =list.stream().max(Comparator.comparingInt(e->e)).get();
        // System.out.println(b);

        // int d =list.stream().max(Comparator.naturalOrder()).get();
        // System.out.println(d);
        //
        // int c =list.stream().min(Comparator.comparingInt(e->e)).get();
        // System.out.println(c);

        // sorted array in ascending and descending order------------------

        // List<Integer> b = list.stream().sorted().collect(Collectors.toList());
        // System.out.println(b);
        // List<Integer> c =
        // list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        // System.out.println(c);

        // pick and skip 5 element from array------------------------------

        // List<Integer> b =list.stream().limit(5).collect(Collectors.toList());
        // System.out.println(b);
        // Integer c = list.stream().limit(5).reduce((p,q)->p+q).get();
        // System.out.println(c);
        //
        // List<Integer> d =list.stream().skip(5).collect(Collectors.toList());
        // System.out.println(d);
        // Integer e = list.stream().skip(5).reduce((p,q)->p+q).get();
        // System.out.println(e);

        // use of Option Class----------------------------------------------------------

        // String a = null;
        // Optional<String> opt = Optional.ofNullable(a);
        // if (opt.isPresent()) {
        // System.out.println("value present "+ opt.get());
        // }else {
        // String value = opt.orElse("Default");
        // System.out.println("value not present " + value);
        // }

        // Return unmodifiable set of values------------------------------

        // Set<Student> s =
        // students.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),
        // e -> Collections.unmodifiableSet(e)));
        // System.out.println(s);

        // find maximum Rollnumber in student collection groupBy student name--------

        Map<String, Integer> a = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getName,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::getRoll)),
                                stud -> stud.map(Student::getRoll).orElse(0)
                                    )
                                )
                        );
        System.out.println(a);

        // find duplicates in array or list----------------------------

        // List<Integer> list2 = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5,
        // 45, 25);

        // HashSet<Integer> hashSet = new HashSet<>();
        // Set<Integer> collect = list2.stream().filter(e ->
        // !hashSet.add(e)).collect(Collectors.toSet());
        // Set<Integer> collect2 = list2.stream().filter(e ->
        // Collections.frequency(list2, e)>1)
        // .collect(Collectors.toSet());

        // System.out.println(collect);
        // System.out.println(collect2);

        // sum of even and odd numbers of array-------------------------------

        // Map<Boolean, Integer> collect =
        // list.stream().collect(Collectors.partitioningBy((e) ->
        // e%2==0,Collectors.summingInt(Integer::intValue)));

        // System.out.println(collect);

        // frequency of duplicate character in a string---------------------------

        // String name = "shivamVashishtha";
        // Map<Character, Long> collect = name.chars().mapToObj(e -> (char)
        // e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // System.out.println(collect);

        // Merge two unsorted array and sort them without duplicates------------------
        // int [] a = {0,3,4,5,3,4,5,2,7,8,4,3,3};
        // int [] b = {0,3,4,5,3,4,9,5,2,7,8,4,3,3,10};
        // int[] array = IntStream.concat(Arrays.stream(a),
        // Arrays.stream(b)).sorted().distinct().toArray();
        // System.out.println(Arrays.toString(array));

        // fibonacci series---------------------------------------------

        int num1 = 0;
        int num2 = 1;

        int sum = 0;
        int limit = 10;

        // for (int i = 0; i < limit; i++) {

        // System.out.print(num1 + " ");
        // sum = num1 + num2;

        // num1 = num2;
        // num2 = sum;
        // }

        System.out.println("by recursion " + num1 + " " + num2 + " ");

    }

}

class Student {
    private int roll;
    private String name;
    private String course;

    public Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}