public class relational_and_logical_operator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a && b) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
        ;

        if (a || b) {
            System.out.println("y");
        } else {
            System.out.println("n");
        }
        ;
        System.out.print("not(a) ");
        System.out.println(!a);
        System.out.print("not(b) ");
        System.out.println(!b);
    }
}
