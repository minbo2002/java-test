package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

    public static void main(String[] args) {

        ArrayList<Integer> c1 = new ArrayList<Integer>();

        c1.add(1);
        c1.add(2);
        c1.add(3);

        int size = c1.size();
        for(int i=0; i<size; i++) {
            System.out.println(c1.get(i));
        }
    }
}

