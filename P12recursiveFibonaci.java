import java.util.stream.Stream;

public class P12recursiveFibonaci {
    static int num1 = 0;
    static int num2 = 1;
    static int limit =10;
    // static public void fibonacci(int n){
    //     if (n > 0) {
    //         int sum = num1 + num2;
    //         System.out.print(" "+ sum);
    //         num1 =  num2;
    //         num2 =  sum;
    //         fibonacci(n-1);
    //     }
    // }

    public static void main(String[] args) {
        // System.out.print("fibonacci by recursive function " + num1 + " " + num2);
        // fibonacci(limit -2);

        Stream.iterate(new int[]{0,1}, f -> new int[]{ f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(e-> System.out.print(e + " "));


    }
}
