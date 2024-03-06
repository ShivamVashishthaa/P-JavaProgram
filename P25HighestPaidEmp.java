import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P25HighestPaidEmp {
    public static void main(String[] args) {
        List<Employee2> list = List.of(
                new Employee2("M", 1, "A", 12),
                new Employee2("F", 2, "B", 14),
                new Employee2("M", 3, "A", 12344),
                new Employee2("M", 4, "A", 1234),
                new Employee2("F", 5, "B", 12346),
                new Employee2("M", 6, "B", 1234),
                new Employee2("F", 6, "B", 1234),
                new Employee2("M", 7, "A", 1234));
        Map<String, Integer> collect = list.stream()
                .collect(Collectors.groupingBy(Employee2::getGender,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee2::getSalary)),
                                e -> e.map(f -> f.getSalary()).orElse(0))));

        System.out.println(collect);

    }
}

class Employee2 {
    private String gender;
    private Integer age;
    private String department;
    private Integer salary;

    public Employee2(String gender, Integer age, String department, Integer salary) {
        this.gender = gender;
        this.age = age;
        this.department = department;
        this.salary = salary;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1 [gender=" + gender + ", age=" + age + ", department=" + department + ", salary=" + salary
                + "]";
    }

}
