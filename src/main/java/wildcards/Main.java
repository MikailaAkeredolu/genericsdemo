package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printList(List<?> anObject){
        for (Object o:anObject) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");    names.add("Jones");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);    numbers.add(2);
        printList(numbers);


    }
}
