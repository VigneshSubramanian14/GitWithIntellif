package PractiseTheseJavaProgram.missingalphabet;

import java.util.ArrayList;
import java.util.List;

public class MissingAlphabet1 {

    public void missingAlphabet() {

        String a = "agrhduklmebxyz";
        String[] obj1 = a.split("");
        String[] obj2 = "abcdefghijklmnopqrstuvwxyz".split("");
        ArrayList ar1 = new ArrayList(List.of(obj1));
        ArrayList ar2 = new ArrayList(List.of(obj2));
        ar2.removeAll(ar1);
        System.out.println(ar2);
    }

    public static void main(String[] args) {
        MissingAlphabet1 obj = new MissingAlphabet1();
        obj.missingAlphabet();
    }
}
