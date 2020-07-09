package i.ua.mail100.modificators.packageTwo;

import i.ua.mail100.modificators.packageOne.PublicClassOne;

public class TwoRunner {

    public static void main(String[] args) {

        PublicClassOne publicClassOne = new PublicClassOne();

        System.out.println(publicClassOne.publicString);
        publicClassOne.publicMethod();

//        System.out.println(publicClassOne.protectedString);
//        publicClassOne.defaultMethod();
//
//        System.out.println(publicClassOne.packageString);
//        publicClassOne.packageMethod();

//        System.out.println(publicClassOne.privateString);
//        publicClassOne.privateMethod();


        SubClassTwo subClassTwo = new SubClassTwo();
        subClassTwo.publicString = "";
        subClassTwo.publicMethod();
//        subClassTwo.protectedString = "";
//        subClassTwo.defaultMethod();
//        subClassTwo.defaultString = "";
//        subClassTwo.defaultMethod();

//        PackageClassOne

    }
}