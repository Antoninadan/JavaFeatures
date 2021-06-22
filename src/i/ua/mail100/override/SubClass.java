package i.ua.mail100.override;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubClass extends SuperClass{
    // allow widen access
    @Override
    public ArrayList<Integer> protectedMethodList(int b, String a){
        return new ArrayList<>();
    }

    // dont shrink return
    @Override
    ArrayList<Integer> methodArrayList(int b, String a){
        return new ArrayList<>();
    }

    @Override
    SubClass methodReturnSuperClass() {
        return new SubClass();
    }


    // allow delete throws
    @Override
    Integer methodThrowsException(int b, String a) throws IOException{
        return 12;
    }

    // not throw new checked exception
//    @Override
//    List<Integer> methodNotThrows(int a, String b) throws IOException{
//        return new ArrayList<>();
//    }

    // throw new UNchacked exception
    @Override
    List<Integer> methodNotThrows2(int a, String b) throws RuntimeException{
        return super.methodNotThrows2(a, b);
    }

    @Override
    Integer methodThrowsIOException(int b, String a){
        return 4;
    }


    // overload in subclass
    @Override
    void methodSpecificnames(int otherSecond, String otherFirst) {
    }
    void methodSpecificnames(int otherSecond, String otherFirst, int c) {
    }


    // allow default -> protected -> public
    @Override
    protected void methodDefault(int a, String b) {
        super.methodDefault(a, b);
    }

    // allow protected -> public
    @Override
    public void methodProtected(int b, String a) {
        super.methodProtected(b, a);
    }

    // static not override
//    @Override
//    static List<Integer> methodStatic(int a, String b){
//        return new ArrayList<>();
//    }

    // final not override
//    @Override
//    final List<Integer> methodFinal(int a, String b){
//        return new ArrayList<>();
//    }

}
