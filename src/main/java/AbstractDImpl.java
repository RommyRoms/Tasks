import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mayun8 on 21.12.2015.
 */
public class AbstractDImpl extends AbstractD {

    @Override
    public int x() {
        return 5;
    }

    public int sum(){
        return 5;
    }

    @Override
    protected ArrayList<String> doSmth(){
        return new ArrayList<>();
    }

    public static int staticX(){
        System.out.println("impl abstractD");
        return 5;
    }

}
