import java.util.Scanner;

public class getting_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter value a");
        int a = sc.nextInt();
        System.out.println("please enter value b");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}