package PractiseTheseJavaProgram.missingalphabet;

import java.util.ArrayList;
import java.util.List;

public class MissingAlphabet3 {

    public void missingAlphabet() {
        String a = "agvhkert";
        String[] obj1 = a.split("");
        String b = "abcdefghijklmnopqrstuvwxyz";
        String[] obj2 = b.split("");
        ArrayList value1 = new ArrayList(List.of(obj1));
        ArrayList value2 = new ArrayList(List.of(obj2));

        value2.removeAll(value1);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        MissingAlphabet3 obj = new MissingAlphabet3();
        obj.missingAlphabet();
    }
}
