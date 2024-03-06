import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P23AverageOfEmployeeAge {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("M",1),
                new Employee("f",2),
                new Employee("M",3),
                new Employee("M",4),
                new Employee("f",5),
                new Employee("M",6),
                new Employee("M",7));
                
        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect);
    }
}

class Employee {
    private String gender;
    private Integer age;

    public Employee(String gender, Integer age) {
        this.gender = gender;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee [gender=" + gender + ", age=" + age + "]";
    }

}