public class multidimentional_array {
    public static void main(String[] args) {
        // displaying 2D array
        // printing array using for loop

        int[][] flats = new int[2][3];

        flats[0][0] = 001;
        flats[0][1] = 002;
        flats[0][2] = 003;
        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[1][2] = 103;

        
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; flats[i].length > j; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            ;
            System.out.println("");
        }
    }
}
