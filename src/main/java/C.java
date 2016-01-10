/**
 * Created by mayun8 on 21.12.2015.
 */
public class C implements A,B {

    @Override
    public int say() {
        System.out.println("from C");
        return 1;
    }
}
