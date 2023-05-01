import java.util.Scanner;

public class threedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] thrd = new int[3][3][3];
        for (int i = 0; i < thrd.length; i++) {
            for (int j = 0; j < thrd[i].length; j++) {
                for (int k = 0; k < thrd[i][j].length; k++) {
                    System.out.println("enter element");
                    thrd[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < thrd.length; i++) {
            for (int j = 0; j < thrd[i].length; j++) {
                for (int k = 0; k < thrd[i][j].length; k++) {
                    System.out.print(thrd[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
