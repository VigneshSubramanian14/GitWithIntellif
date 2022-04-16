package PractiseTheseJavaProgram.missingalphabet;

import java.util.ArrayList;
import java.util.List;

public class MissingAlphabet4 {

    public void missingAlphabet() {
        String a = "afhghvbsdj";
        String[] a1 = a.split("");
        String[] b1 = "abcdefghijklmnopqrstuvwxyz".split("");
        ArrayList obj1 = new ArrayList(List.of(a1));
        ArrayList obj2 = new ArrayList(List.of(b1));
        obj2.removeAll(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        MissingAlphabet4 obj = new MissingAlphabet4();
        obj.missingAlphabet();
    }
}
