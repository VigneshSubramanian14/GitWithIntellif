package PractiseTheseJavaProgram.duplicates.in.string;

public class DuplicatesInAString3 {

    public static void duplicates(String input) {

        String newInput = input.toLowerCase();
        char[] ch = newInput.toCharArray();
        int count = 0;
        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<input.length();j++){
                if (ch[i]==ch[j]){
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String value = "Today Is Monday wakuep";
        String newValue = value.replace(" ","");
        duplicates(newValue);
    }
}
