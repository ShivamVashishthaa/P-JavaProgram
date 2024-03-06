import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P24AllTheDepartment {
    public static void main(String[] args) {
        List<Employee1> list = List.of(
                new Employee1("M", 1, "A"),
                new Employee1("F", 2, "B"),
                new Employee1("M", 3, "A"),
                new Employee1("M", 4, "A"),
                new Employee1("F", 5, "B"),
                new Employee1("M", 6, "B"),
                new Employee1("F", 6, "B"),
                new Employee1("M", 7, "A"));
        // method 1
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
        System.out.println(collect);
        List<String> collect2 = collect.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
        System.out.println(collect2);

        System.out.println("entry set : "+collect.entrySet());

        // method 2
        list.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);
    }
}

class Employee1 {
    private String gender;
    private Integer age;
    private String department;

    public Employee1(String gender, Integer age, String department) {
        this.gender = gender;
        this.age = age;
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [gender=" + gender + ", age=" + age + ", department=" + department + "]";
    }

}