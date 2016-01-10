/**
 * Created by mayun8 on 21.12.2015.
 */

public class Test {

    public static void main(String[] args) {
        A c1 = new C();
        c1.say();

        B c2 = new C();
        c2.say();
        System.out.println("-------------------");
        AbstractD d1 = new AbstractDImpl();
        System.out.println(d1.sum());

        AbstractDImpl d2 = new AbstractDImpl();
        System.out.println(d2.sum());

        int d3 = AbstractD.staticX();
        int d4 = AbstractDImpl.staticX();
        System.out.println("-------------------");

        E e = new E("1");

        System.out.println("-------------------");

        F.F1.F2.F3 x = new F.F1.F2.F3();
        System.out.println(x.x);
    }
}
