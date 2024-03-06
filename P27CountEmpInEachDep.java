import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class P27CountEmpInEachDep {
    public static void main(String[] args) {
        List<Employee5> list = List.of(
                new Employee5("M", 1, "A", 12, 2013),
                new Employee5("F", 2, "B", 14, 2012),
                new Employee5("M", 3, "A", 12344, 2011),
                new Employee5("M", 4, "A", 1234, 2014),
                new Employee5("F", 5, "B", 12346, 2015),
                new Employee5("M", 6, "B", 1234, 2016),
                new Employee5("F", 6, "B", 1234, 2017),
                new Employee5("M", 7, "A", 1234, 2018));

                Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee5::getDepartment,Collectors.counting()));

                System.out.println(collect);

                for (Entry<String,Long> entry : collect.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }


    }
}

class Employee5 {
    private String gender;
    private Integer age;
    private String department;
    private Integer salary;
    private Integer date;

    public Employee5(String gender, Integer age, String department, Integer salary, Integer date) {
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