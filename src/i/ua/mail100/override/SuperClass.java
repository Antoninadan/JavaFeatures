package i.ua.mail100.override;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuperClass {

    List<Integer> methodList(){
        return new ArrayList<>();
    }

    ArrayList<Integer> methodArrayList(){
        return new ArrayList<>();
    }


    Integer methodThrowsException() throws Exception {
        return 4;
    }

    Integer methodThrowsIOException() throws IOException {
        return 4;
    }

    private void methodPrivate(){
    }

    protected void methodProtected(){
    }

    void methodSpecificnames(int first, String second){

    }
}
