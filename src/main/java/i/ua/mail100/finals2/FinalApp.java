package i.ua.mail100.finals2;

import java.util.Arrays;
import java.util.List;

public class FinalApp {
    final static int stat;
    final int nonStat;

    static {
        stat = 1;
    }

    {
        nonStat = 1;
    }

    public static void main(String[] args) {
        final int finInt = 1;
        // error finInt = 2;

        final List<Integer> finInteger = Arrays.asList(1,2);
        finInteger.set(0,2);

    }
}
