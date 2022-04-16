package PractiseTheseJavaProgram.getKey.usingValue.inHashMap;

import java.util.HashMap;
import java.util.Map;

public class GetSpecificKeyUsingValue1 {

    public void specificKey() {
        HashMap<Integer, String> obj = new HashMap<>();
        obj.put(1, "A");
        obj.put(2, "B");
        obj.put(3, "C");
        obj.put(4, "D");
        obj.put(5, "E");
        obj.put(6, "G");
        obj.put(7, "H");

        //to print specific key using value:
        for (Map.Entry<Integer, String> value : obj.entrySet()) {
            if (value.getValue().equals("C")) {
                System.out.println(value.getKey());
            }
        }
    }

    public static void main(String[] args) {
        GetSpecificKeyUsingValue1 obj = new GetSpecificKeyUsingValue1();
        obj.specificKey();
    }
}
