package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString4 {

    public void duplicatesInString() {
        String name = "TodayIsMondayWakeup";
        int count = 0;
        char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicatesInAString4 obj = new DuplicatesInAString4();
        obj.duplicatesInString();
    }
}
