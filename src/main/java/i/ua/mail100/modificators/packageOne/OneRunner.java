package i.ua.mail100.modificators.packageOne;

import i.ua.mail100.modificators.packageTwo.SubClassTwo;

public class OneRunner {

    public static void main(String[] args) {

        PublicClassOne publicClassOne = new PublicClassOne();

        System.out.println(publicClassOne.publicString);
        publicClassOne.publicMethod();

        System.out.println(publicClassOne.protectedString);
        publicClassOne.protectedMethod();

        System.out.println(publicClassOne.packageString);
        publicClassOne.packageMethod();




        SubClassTwo subClassTwo = new SubClassTwo();

        System.out.println(subClassTwo.publicString);
        subClassTwo.publicMethod();

        System.out.println(subClassTwo.protectedString);
        subClassTwo.protectedMethod();

//        System.out.println(subClassTwo.packageString);
//        subClassTwo.packageMethod();

    }
}