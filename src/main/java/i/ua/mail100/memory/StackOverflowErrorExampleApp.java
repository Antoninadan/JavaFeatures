package i.ua.mail100.memory;

public class StackOverflowErrorExampleApp {

    public static void main(String[] args) {
        StackOverflowErrorExampleApp.recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
