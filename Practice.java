import java.lang.reflect.Method;

/**
 * Practice
 */
public class Practice {
    public static void main(String[] args) {
        int count = 0;
        Object o = new String("Shivam");
        Class c = o.getClass();
        System.out.println("fully qualified name: " + c.getName());
        System.out.println("================================================");
        Method [] methods = c.getDeclaredMethods();
        System.out.println("Method Information");
        System.out.println("================================================");
        for (Method m1 : methods) {
            count++;
            System.out.println(m1.getName());
            System.out.println("================================================");
        }
        System.out.println("No. of methods: " + count);

    }
}