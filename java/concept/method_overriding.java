class A  {
    public int a;

    public int pushti() {
        return 143;
    }

    public void math() {
        System.out.println("this is a method meth of class A");
    }
}

class B extends A {
    public void math() {
        System.out.println("this  is a method math of class B");
    }

    public void math2() {
        System.out.println("this is a method 2 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.math();

        B b = new B();
        b.math();

        B c = new B();
        c.math2();
    }
}
