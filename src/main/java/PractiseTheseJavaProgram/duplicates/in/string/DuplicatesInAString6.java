package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString6 {

    public void duplicatesInString(String input) {
        char[] ch = input.toCharArray();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicatesInAString6 obj = new DuplicatesInAString6();
        obj.duplicatesInString("TodayIsMondayWakeup");
    }
}
