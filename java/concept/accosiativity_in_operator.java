public class accosiativity_in_operator {
    public static void main(String[] args) {
        // accosiativity_in_operator
        int a = 6 * 2 - 32 / 2;
        System.out.println(a);

        /*
         * a = 12-32/2;
         * a = 12-16;
         * a = -4
         */
        int b = 6 / 2 - 32 * 2;
        System.out.println(b);
        /*
         * b = 3 - 32*3;
         * b = 3 - 96;
         * b = 93;
         */

         int c =  ((b*b)-(4*a*a))/2;
         System.out.println(c);

         int d = (a-b)/2;
         System.out.println(d);
    }
}
