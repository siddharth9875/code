public class method_overloading {

    static void joks() {
        System.out.println("anyone tell me what you seek");
    }

    static void fool(int a) {
        System.out.println("good morning " + a);
        
    }

    static int fool(int x, int y) {
        System.out.println("good morning " + x);
        System.out.println("good morning " + y);
        return 0;
    }

    public static void main(String[] args) {
        joks();
        fool(1);
        fool(2, 333);
    }
}

