public class string_qustion {
    public static void main(String[] args) {
        String name = "hello world";
        name = name.toUpperCase();
        System.out.println(name);

        //replace space with underscore
        name = name.replace(" ", "_");
        System.out.println(name);

        String letter = "\t dear pushti \n\t what you seek is seeking you.";
        System.out.println(letter);


        String space = "string contain double  and triple spaces ";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));
    }
}
