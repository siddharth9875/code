import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = sc.nextInt();

        // if (age < 10) {
        // System.out.println("you are kid you cannot kid");
        // } else if (age < 18) {
        // System.out.println("you are no eligable for driving");
        // } else if (age > 18) {
        // System.out.println("you are eligable for driving");
        // }

        System.out.println("please enter weekly day name");
        String day = sc.next();
        switch (day) {
            case "sunday":
                System.out.println("this is sunday");
                break;
            case "monday":
                System.out.println("this is monday");
                break;
            case "tuesday":
                System.out.println("this is tuesday");
                break;
            case "wensday":
                System.out.println("this is wensday");
                break;
            case "thirsday":
                System.out.println("this is thirsday");
                break;
            case "friday":
                System.out.println("this is friday");
                break;
            case "seturday":
                System.out.println("this is seturday");
                break;

            default:
                System.out.println("please enter right information");
                break;
        }
    }
}
