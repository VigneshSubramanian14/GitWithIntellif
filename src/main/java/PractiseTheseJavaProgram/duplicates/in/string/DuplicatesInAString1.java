package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString1 {

    public void duplicatesInString() {
        String a = "TodayIsMondayWakeup";
        String a1 = a.toLowerCase();
        char[] ch = a1.toCharArray();
        int count = 0;
        for (int i = 0; i < a1.length(); i=i+1) {
            for (int j = i + 1; j < a1.length(); j=j+1) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicatesInAString1 obj = new DuplicatesInAString1();
        obj.duplicatesInString();
    }
}
