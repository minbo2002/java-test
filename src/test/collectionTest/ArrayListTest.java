package test.collectionTest;

import java.util.ArrayList;

public class ArrayListTest {

    public void ArrayTest1() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "A2");

        for(String x : list) {
            System.out.println(x);
        }
    }

    public void ArrayTest2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.get(0));  // A
        System.out.println(list.size());  // 3
        System.out.println(list.indexOf("C"));  // 2
        System.out.println(list.lastIndexOf("C")); // 2

        String[] strs = new String[0];
        String[] listToArray = list.toArray(strs);
        for(String x : listToArray) {
            System.out.println(x);  // A, B, C
        }

        String [] listToArray2 = list.toArray(new String[5]);
        for(String x : listToArray2) {
            System.out.println(x);  // A, B, C, null, null
        }
    }

    public void ArrayTest3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

//        list.clear();
//        System.out.println(list.remove(0));
//        System.out.println(list.remove("A"));

        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);

        for(int i=0; i<list.size(); i++) {
            System.out.println("list.get("+i+")="+list.get(i));
        }

    }

    public static void main(String[] args) {

        ArrayListTest alt = new ArrayListTest();
//
//        alt.ArrayTest1();
//        alt.ArrayTest2();
        alt.ArrayTest3();
    }

}
