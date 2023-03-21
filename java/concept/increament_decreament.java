import java.lang.ProcessBuilder.Redirect.Type;

import org.w3c.dom.TypeInfo;

public class increament_decreament {
    /**
     * @param args
     */
    public static void main(String[] args) {

        byte a = 10;
        int y = 5;
        short z = 2;

        int b = y + z;
        System.out.println(b);
        float c = 3.5f + a;
        System.out.println(c);

        // increment and decrement operator

        int p = 1;
        p++;// first p is assigned and then after increment
        System.out.println(p);// result 1
        System.out.println(p);// result 2
        ++p;// first increment and then after assign
        System.out.println(p);// result 3

        int q = 1;
        q--;// first q is assigned and then after decrement
        System.out.println(q);// result 1
        System.out.println(q);// result 0
        --q;// first decrement and then after assign
        System.out.println(q);// result -1

    }
}
