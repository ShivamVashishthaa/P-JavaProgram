import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P22MaleFemaleCount {
    public static void main(String[] args) {
        List<MaleFemale> list = List.of(
            new MaleFemale("M"),
            new MaleFemale("F"),
            new MaleFemale("M"),
            new MaleFemale("F"),
            new MaleFemale("M"),
            new MaleFemale("M"),
            new MaleFemale("F")
        );

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(MaleFemale::getGender,Collectors.counting()));
        System.out.println(collect);
    }
}

/**
 * InnerP22MaleFemaleCount
 */
class MaleFemale {
private String gender;

public MaleFemale(String gender) {
    this.gender = gender;
}

public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}

@Override
public String toString() {
    return "MaleFemale [gender=" + gender + "]";
}
    
}