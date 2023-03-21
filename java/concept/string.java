import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // String name = new String("pushti");
        String name = "pushti";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        System.out.println(n);

        int a = 2;
        float b = 1.0f;

        System.out.printf("the value of a is %a", a);
        System.out.printf("the value of b is %f", b);
    }
}
