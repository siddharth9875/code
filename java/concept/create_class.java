
class employee {
    static int id;
    static int salary;
    static String name;

    static void getdetail() {
        System.out.println("employee id is " + id);
        System.out.println("employee name is " + name);
        System.out.println("employee selary is " + salary);
    };
}
public class create_class {


    public static void main(String[] args) {
        System.out.println("this is your custom class");
        employee sid = new employee();
        sid.id = 1;
        sid.salary = 100000;
        sid.name = "siddharth";
        employee.getdetail();
    }
}
