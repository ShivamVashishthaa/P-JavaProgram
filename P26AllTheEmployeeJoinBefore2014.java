import java.util.List;
import java.util.stream.Collectors;

/**
 * P26AllTheEmployeeJoinBefore2014
 */
public class P26AllTheEmployeeJoinBefore2014 {

    public static void main(String[] args) {
        List<Employee4> list = List.of(
                new Employee4("M", 1, "A", 12, 2013),
                new Employee4("F", 2, "B", 14, 2012),
                new Employee4("M", 3, "A", 12344, 2011),
                new Employee4("M", 4, "A", 1234, 2014),
                new Employee4("F", 5, "B", 12346, 2015),
                new Employee4("M", 6, "B", 1234, 2016),
                new Employee4("F", 6, "B", 1234, 2017),
                new Employee4("M", 7, "A", 1234, 2018));

        List<Integer> collect = list.stream().filter(e -> e.getDate() < 2014).map(f -> f.getSalary())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}

class Employee4 {
    private String gender;
    private Integer age;
    private String department;
    private Integer salary;
    private Integer date;

    public Employee4(String gender, Integer age, String department, Integer salary, Integer date) {
        this.gender = gender;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.date = date;
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

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee4 [gender=" + gender + ", age=" + age + ", department=" + department + ", salary=" + salary
                + ", date=" + date + "]";
    }

}