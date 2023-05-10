package com.yash;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax:
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(58);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);
        System.out.println(list.contains(654)); // true
        System.out.println(list.contains(766554)); // false
        list.set(0, 99); // 0eth index will be changed to 99
        list.remove(2);
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            list.get(i);
        }
    }
}
