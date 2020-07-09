package i.ua.mail100.modificators.packageTwo;

import i.ua.mail100.modificators.packageOne.PublicClassOne;

public class SubClassTwo extends PublicClassOne {

    public void method(){
        System.out.println(publicString);
        System.out.println(protectedString);
        publicMethod();
        protectedMethod();
    }

    public static void main(String[] args) {
        SubClassTwo subClassTwo = new SubClassTwo();
        System.out.println(subClassTwo.publicString);
        System.out.println(subClassTwo.protectedString);
        subClassTwo.publicMethod();
        subClassTwo.protectedMethod();
    }
}
