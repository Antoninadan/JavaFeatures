package i.ua.mail100.override;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubClass extends SuperClass{
    // allow widen access
    @Override
    public ArrayList<Integer> methodList(){
        return new ArrayList<>();
    }

    // dont shrink return
    @Override
    ArrayList<Integer> methodArrayList(){
        return new ArrayList<>();
    }

    // allow delete throws
    @Override
    Integer methodThrowsException() throws IOException{
        return 12;
    }

    @Override
    Integer methodThrowsIOException(){
        return 4;
    }

    // allow widen access
    @Override
    public void methodProtected() {
        super.methodProtected();
    }

    @Override
    void methodSpecificnames(int otherSecond, String otherFirst) {
    }
}
