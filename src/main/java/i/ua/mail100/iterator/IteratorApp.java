package i.ua.mail100.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    static List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        listIterator();
        // listForEachRemove(); // throws UnsupportedOperationException

        list.iterator().forEachRemaining((each) -> System.out.println(each));
    }

    static void listIterator() {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    // throws UnsupportedOperationException
    static void listForEachRemove() {
       for (Integer each:list){
           list.remove(1);
       }
    }


}
