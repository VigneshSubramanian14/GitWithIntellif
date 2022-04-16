package SampleCheck.Programcheck.com.interview.questions;

public class JoinString {

    public void joinString() {
        String a = "Good";
        String b = "Morning";
        b = a + b;
        StringBuffer buffer = new StringBuffer();
        buffer.append(b);
        System.out.println(buffer);
    }

    public static void main(String[] args) {
        JoinString obj = new JoinString();
        obj.joinString();
    }
}
