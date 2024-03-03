import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * StreamQuestion
 */
public class StreamQuestion {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 45, 25);

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

        // Find max and min in array
        // ----------------------------------------------------

        // int b =list.stream().max(Comparator.comparingInt(e->e)).get();
        // System.out.println(b);
        //
        // int c =list.stream().min(Comparator.comparingInt(e->e)).get();
        // System.out.println(c);

        // sorted array in ascending and descending
        // order--------------------------------

        // List<Integer> b = list.stream().sorted().collect(Collectors.toList());
        // System.out.println(b);
        // List<Integer> c =
        // list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        // System.out.println(c);

        // pick and skip 5 element from
        // array-------------------------------------------------

        // List<Integer> b =list.stream().limit(5).collect(Collectors.toList());
        // System.out.println(b);
        // Integer c = list.stream().limit(5).reduce((p,q)->p+q).get();
        // System.out.println(c);
        //
        // List<Integer> d =list.stream().skip(5).collect(Collectors.toList());
        // System.out.println(d);
        // Integer e = list.stream().skip(5).reduce((p,q)->p+q).get();
        // System.out.println(e);

        // find 2nd greatest and smallest number in
        // array------------------------------------
        // Integer b =
        // list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        // System.out.println(b);
        // Integer c =
        // list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        // System.out.println(c);

        // use of Option Class
        // ----------------------------------------------------------

        // String a = null;
        // Optional<String> opt = Optional.ofNullable(a);
        // if (opt.isPresent()) {
        // System.out.println("value present "+ opt.get());
        // }else {
        // String value = opt.orElse("Default");
        // System.out.println("value not present " + value);
        // }

        // Return unmodifiable set of values-------------------------------------------

        // Set<Student> s =
        // students.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),
        // e -> Collections.unmodifiableSet(e)));
        // System.out.println(s);

        // find maximum Rollnumber in student collection groupBy student name--------

        // Map<String,Integer> a = students.stream()
        // .collect(Collectors.groupingBy(
        // Student::getName,
        // Collectors.collectingAndThen(
        // Collectors.maxBy(Comparator.comparingInt(Student::getRoll)),
        // stud-> stud.map(Student::getRoll).orElse(0)
        // )
        // ));
        // System.out.println(a);

        //

        

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