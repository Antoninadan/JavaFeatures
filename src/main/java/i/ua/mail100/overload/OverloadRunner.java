package i.ua.mail100.overload;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OverloadRunner {
    public static void main(String[] args) {
        method1(1, "Str");
        method1("Str", 1);
        method1("Str", 1, 2);

        // m("Str", 9);  - only right arguments order

        methodStringInt("", 1);

    }

    // change arguments, return type
    static void method1(int digit, String string){
        System.out.println(digit + string);
    }
    static void method1(String string123, int digit123){
        System.out.println(string123 + digit123);
    }
    static String method1(String string123, int digit123, int c){
        System.out.println("return type void -> String");
        return "";
    }


    static void m(int i, String string){
        System.out.println(i + string);
    }


    List<Integer> methodList(int a, String b){
        return new ArrayList<>();
    }
    static void methodStringInt(String b , int a){}
    static void methodStringString(String a , String b){}



    // throws can be different
    List<Integer> methodNotThrows(int a, String b){
        return new ArrayList<>();
    }
    List<Integer> methodNotThrows(int a, String b, int c) throws IOException{
        return new ArrayList<>();
    }

    // throws can be different
    List<Integer> methodNotThrows2(int a, String b){
        return new ArrayList<>();
    }
    List<Integer> methodNotThrows2(int a, String b, int c) throws RuntimeException{
        return new ArrayList<>();
    }


    // static ok
    static List<Integer> methodStatic(int a, String b){
        return new ArrayList<>();
    }
    static List<Integer> methodStatic(int a, String b, int c){
        return new ArrayList<>();
    }


    // final ok
    final List<Integer> methodFinal(int a, String b){
        return new ArrayList<>();
    }
    final List<Integer> methodFinal(int a, String b, int c){
        return new ArrayList<>();
    }


    // any return type
    ArrayList<Integer> methodArrayList(int a, String b){
        return new ArrayList<>();
    }
    List<Integer> methodArrayList(int a, String b, int c){
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
