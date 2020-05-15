package i.ua.mail100.finals;

public class FinalExampleSubClass extends FinalExampleSuperClass{
    public FinalExampleSubClass(int int1) {
        super(int1);
    }

    @Override
    public void testNotFinal() {
        super.testNotFinal();
    }

//    @Override
//    public void tesFinal() {
//        super.testNotFinal();
//    }

}
