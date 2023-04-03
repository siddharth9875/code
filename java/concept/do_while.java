import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.println("write table using while loop");
        Scanner s = new Scanner(System.in);
        int table = s.nextInt();
        int i = 0;
        do {
            System.out.println(table + "x" + i + "=" + table * i);
            i++;
        } while (i <= 10);
    }
}
