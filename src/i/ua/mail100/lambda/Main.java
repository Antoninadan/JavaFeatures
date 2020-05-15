package i.ua.mail100.lambda;

public class Main {
    public static void main(String[] args) {
        // simple
        FunctionalInterfaceItem functionalInterfaceItem;
        functionalInterfaceItem = (x, y) -> x * x;
        System.out.println(functionalInterfaceItem.get(5, 1090909));


        // difficult
        FunctionalInterfaceDifficult functionalInterfaceDifficult;
        functionalInterfaceDifficult = n -> {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        };
        System.out.println(functionalInterfaceDifficult.get(5));


    }
}

@FunctionalInterface
interface FunctionalInterfaceItem {
    public int get(int n, int m);
}


@FunctionalInterface
interface FunctionalInterfaceDifficult {
    public int get(int n);
}