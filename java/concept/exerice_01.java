import java.util.Scanner;

public class exerice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter mark in physics");
        int physics = sc.nextInt();
        System.out.println("please enter mark in chemistry");
        int chemistry = sc.nextInt();
        System.out.println("please enter mark in math");
        int maths = sc.nextInt();
        int total = (physics + chemistry + maths) / 3;
        System.out.println(total);

        // problem 2

        System.out.println("please enter your name");
        String str = sc.next();
        String hello = "hello " + str;
        System.out.println(hello);

        //problem 3

        System.out.println("please enter number");
        System.out.println(sc.hasNextInt());
    }
}
