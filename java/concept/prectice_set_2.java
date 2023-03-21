import java.util.Scanner;

public class prectice_set_2 {
    public static void main(String[] args) {
        float a = 7 / 2.0f * 3 / 4.0f;
        System.out.println(a);

        // encode
        char b = 'p';
        b = (char) (b + 8);
        System.out.println(b);

        // decode

        b = (char) (b - 7);
        System.out.println(b);



        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s > 9);
        
        System.out.println(7*49/7+35/3);
    }
}
