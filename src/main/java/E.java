/**
 * Created by mayun8 on 21.12.2015.
 */
public class E {



    public String strIninialized = "var initialized";
    public String strConstruct;
    public static String strStatic;
    public String strNonStatic;
    public static String Sstat = "static";
    public E ex;

    public E(String strConstruct) {
        this.strConstruct = strConstruct;
        System.out.println("constructor");
    }

    static {
        System.out.println("static block");
        strStatic = "static block";
    }

    {
        System.out.println("non static");
        strNonStatic = "NONstatic";
    }


}
