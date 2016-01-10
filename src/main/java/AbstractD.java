import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mayun8 on 21.12.2015.
 */
public abstract class AbstractD {

    public int sum(){
        System.out.println("from AbstractD");
        System.out.println(x());
        return 5-x();
    }

    public abstract int x();

    protected List<String> doSmth()throws IOException,SQLException{
        System.out.println("return arraylist");
        return new ArrayList<>();
    }

    public static int staticX(){
        System.out.println("abstractD");
        return 3;
    }



}
