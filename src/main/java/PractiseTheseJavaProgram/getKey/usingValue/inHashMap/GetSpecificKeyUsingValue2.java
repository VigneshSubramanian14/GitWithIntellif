package PractiseTheseJavaProgram.getKey.usingValue.inHashMap;

import java.util.HashMap;
import java.util.Map;

public class GetSpecificKeyUsingValue2 {

    public void getSpecificKey() {
        HashMap<Integer, String> obj = new HashMap<>();
        obj.put(1, "A");
        obj.put(2, "B");
        obj.put(3, "C");
        obj.put(4, "D");
        obj.put(5, "E");
        obj.put(6, "G");
        obj.put(7, "H");

        for (Map.Entry<Integer,String> value:obj.entrySet()){
            if (value.getValue().equals("D")){
                System.out.println(value.getKey());
            }
        }
    }

    public static void main(String[] args) {
        GetSpecificKeyUsingValue2 obj = new GetSpecificKeyUsingValue2();
        obj.getSpecificKey();
    }
}
