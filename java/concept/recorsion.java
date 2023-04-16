public class recorsion {
    // static int fibonacci(int n) {
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    static int factorial(int n) {
        if (n == 0 | n == 1) {
            return 1;
        }
        else {
            
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("fectorial 5 is a " +factorial(5));

        System.out.println("fibonacci series of 10 is a " );
    }
}
