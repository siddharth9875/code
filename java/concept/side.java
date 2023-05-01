
public class side {
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
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }
}
