package PractiseTheseJavaProgram.getKey.usingValue.inHashMap;

import java.util.HashMap;
import java.util.Map;

public class GetSpecificKeyUsingValue {

    public void getKeyUsingValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "$");
        map.put(1, "|");
        map.put(2, "*");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            if (m.getValue().equals("|")) {
                System.out.println(m.getKey());
            }
        }
    }

    public void getKeyUsingValue1(){
        Map<Integer, String> map = new HashMap<>();
        map.put(110, "A");
        map.put(276, "B");
        map.put(778, "C");
        for(Map.Entry<Integer, String> obj : map.entrySet()){
            if (obj.getValue().equals("B")){
                System.out.println(obj.getKey());
            }
        }
    }

    public static void main(String[] args) {
        GetSpecificKeyUsingValue obj = new GetSpecificKeyUsingValue();
        obj.getKeyUsingValue();
        obj.getKeyUsingValue1();
    }
}
