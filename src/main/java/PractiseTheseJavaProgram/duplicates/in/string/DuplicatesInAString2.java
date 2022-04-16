package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString2 {

    public void duplicates() {
        String a = "TodayISMonday";
        String a1 = a.toLowerCase();
        char[] ch = a1.toCharArray();
        int count = 0;
        for (int i = 0; i < a1.length(); i++) {
            for (int j = i + 1; j < a1.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicatesInAString2 obj = new DuplicatesInAString2();
        obj.duplicates();
    }
}
