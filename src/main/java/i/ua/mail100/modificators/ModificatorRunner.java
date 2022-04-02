package i.ua.mail100.modificators;

import i.ua.mail100.modificators.packageOne.PublicClassOne;
import i.ua.mail100.modificators.packageTwo.SubClassTwo;
import i.ua.mail100.modificators.packageTwo.ClassTwo;

public class ModificatorRunner {
    public static void main(String[] args) {

        PublicClassOne publicClassOne = new PublicClassOne();
        publicClassOne.publicString = "";
        publicClassOne.publicMethod();

        ClassTwo classTwo = new ClassTwo();
        classTwo.publicString = "";
        classTwo.publicMethod();
//        classTwo.protectedString = "";
//        classTwo.defaultMethod();
//        classTwo.defaultString = "";
//        classTwo.defaultMethod();


        SubClassTwo subClassTwo = new SubClassTwo();
        subClassTwo.publicString = "";
        subClassTwo.publicMethod();
//        subClassTwo.protectedString = "";
//        subClassTwo.defaultMethod();
//        subClassTwo.defaultString = "";
//        subClassTwo.defaultMethod();

    }
}
