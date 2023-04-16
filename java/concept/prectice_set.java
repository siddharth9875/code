import java.util.regex.Pattern;

public class prectice_set {
    static int multiplicitation(int a) {
        for (int i = 1; i <= a + 1; i++) {
            System.out.format("%d X %d = %d", a, i, a * i);
            System.out.println();
        }
        return 0;

    }

    static boolean pattern(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return true;
    }

    static int patt_rec(int n) {
        if (0 < n) {
            patt_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return 0;
    }

    static int sum_rec(int a) {
        if (a == 1 | a == 0) {
            return a;
        }
        return a + sum_rec(a - 1);
    }

    static int fib(int a) {
        if (a == 1 | a == 2) {
            return a - 1;
        }
        else {
            
            return fib(a - 1) + fib(a - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(multiplicitation(9));
        System.out.println("");
        System.out.println(pattern(5));
        System.out.println("");
        System.out.print(patt_rec(5));
        System.out.println("");
        System.out.println(sum_rec(50));
        System.out.println("");
        System.out.println(fib(10));
    }
}
