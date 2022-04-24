package Buoi3;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("somrthing");
        arrList.add("something");

        for (String s:
             arrList) {
            System.out.println(s);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        for (Integer n: map.keySet()) {
            System.out.println(n);
        }

    }

}
