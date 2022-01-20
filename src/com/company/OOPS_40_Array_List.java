package com.company;

import java.util.*;

public class OOPS_40_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5); // By-default iCapacity is 10
        l2.add(14);
        l2.add(21);
        l2.add(13);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        // l1.addAll(l2); // This appends the ArrList l2 in l1.
        l1.addAll(0, l2);
        // l1.clear(); Clears all the items from the list.....
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(7));
    }
}
