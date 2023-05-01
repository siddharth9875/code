public class string_method {
    public static void main(String[] args) {

        String name = "pusphti";
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.substring(3));

        String nontrim = "   siddharth     ";
        System.out.println(nontrim.trim());

        System.out.println(name.charAt(3));

        System.out.println(name.replace("pu", "su"));
        
        System.out.println(name.startsWith("pu"));

        System.out.println(name.endsWith("tt"));

        System.out.println(name.indexOf("us"));

        System.out.println(name.lastIndexOf("p"));

        System.out.println(name.equals("pushti"));
        System.out.println(name.equalsIgnoreCase("Pushti"));
    }
}