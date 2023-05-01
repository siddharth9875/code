import java.util.Scanner;

public class conditional_stetment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter age");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("you are not eligable for driving");
        } else if (age > 60) {
            System.out.println("you are old men for you not eligable to driving");
        }
        else {
            System.out.println("eligable for driving");
        }
    }
}