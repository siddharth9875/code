import java.util.Scanner;

public class conditional_stetment {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("please enter your age");
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("you are eligable for driving a car");
            } else {
                System.out.println("you cannot eligable for driving car");
            }
        }
    }
}