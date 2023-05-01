public class for_Each_loop {
    public static void main(String[] args) {
        int[] mark = { 87, 56, 44, 89, 66 };

        // displaying array
        // System.out.println(mark[0]);
        // System.out.println(mark[1]);
        // System.out.println(mark[2]);
        // System.out.println(mark[3]);
        // System.out.println(mark[4]);
        // System.out.println(" ");
        // System.out.println(" ");
        // System.out.println(" ");

        // // displaying array using for loop

        // for (int i = 0; mark.length >= i; i++) {
        //     System.out.println(mark[i]);
        // }

        // display array using for loop
        for (int element: mark) {
            System.out.println(element);
        };
        System.out.println("_______)_");
    }
}
