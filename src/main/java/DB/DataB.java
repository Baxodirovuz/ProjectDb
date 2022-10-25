package DB;

import java.util.ArrayList;
import Object.*;

public class DataB {
    private static DataB dataB = new DataB();
    public static DataB getDataB(){
        return dataB;
    }


    public ArrayList<User> users = new ArrayList<>();
}
