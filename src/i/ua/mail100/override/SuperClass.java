package i.ua.mail100.override;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuperClass {

    List<Integer> protectedMethodList(int a, String b){
        return new ArrayList<>();
    }

    List<Integer> methodNotThrows(int a, String b){
        return new ArrayList<>();
    }

    List<Integer> methodNotThrows2(int a, String b){
        return new ArrayList<>();
    }

    static List<Integer> methodStatic(int a, String b){
        return new ArrayList<>();
    }

    final List<Integer> methodFinal(int a, String b){
        return new ArrayList<>();
    }

    ArrayList<Integer> methodArrayList(int a, String b){
        return new ArrayList<>();
    }


    Integer methodThrowsException(int a, String b) throws Exception {
        return 4;
    }

    Integer methodThrowsIOException(int a, String b) throws IOException {
        return 4;
    }

    private void methodPrivate(int a, String b){
    }

    protected void methodProtected(int a, String b){
    }

    void methodDefault(int a, String b){
    }


    void methodSpecificnames(int first, String second){

    }
}
