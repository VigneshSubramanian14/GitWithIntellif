package SampleCheck.Programcheck;

import java.util.*;

public class RemoveDuplicatesInArray {

    public void removeDuplicate() {
        ArrayList<Integer> obj = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4, 5, 2, 1, 5));
        LinkedHashSet<Integer> value = new LinkedHashSet<>(obj);
        ArrayList<Integer> obj1 = new ArrayList<>(value);
        System.out.println(value);
    }

    public void printingHashMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);

        map.forEach((K,V)-> System.out.println("Key= "+K+" "+"Value= "+V));
    }

    public void arrayVsArrayList(){
        int[] a = {1,2,3,4,5};
        Integer[] b = {12,13,14,14};

        ArrayList<Integer> value = new ArrayList<Integer>();
    }

    public static void main(String[] args) {
        RemoveDuplicatesInArray obj = new RemoveDuplicatesInArray();
        obj.removeDuplicate();
        obj.printingHashMap();
    }
}
