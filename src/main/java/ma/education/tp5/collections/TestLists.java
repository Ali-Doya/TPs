package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2, 10);
        list3.forEach(i -> System.out.println(i));
    }
}

