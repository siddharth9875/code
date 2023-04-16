public class varrags {

    static int sum(int x) {

        return x;
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = +a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum of 1 is " + sum(1));
        System.out.println("sum of 2 and 3 is " + sum(2, 3));
        System.out.println("sum of 2,3,4 is " + sum(2, 3, 4));
        System.out.println("sum of 1,2,3,4,5,6,7,8" + sum(1, 2, 3, 4, 5, 6, 7, 8));
    }
}
