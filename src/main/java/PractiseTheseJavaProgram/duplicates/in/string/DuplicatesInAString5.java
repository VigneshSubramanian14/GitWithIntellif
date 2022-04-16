package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString5 {

    public void duplicateInString(String input) {
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
        DuplicatesInAString5 obj = new DuplicatesInAString5();
        String value = "TodayIsMonday";
        obj.duplicateInString(value);
    }
}
