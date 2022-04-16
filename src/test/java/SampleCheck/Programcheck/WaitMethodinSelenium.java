package SampleCheck.Programcheck;

public class WaitMethodinSelenium {

    public void characterArray(){
        String a = "Balavignesh";
       char[] value1 = a.toCharArray();
      for (int j=value1.length-1;j>=0;j=j-1){
          System.out.println(value1[j]);
      }

    }

    public static void main(String[] args) {
        WaitMethodinSelenium obj = new WaitMethodinSelenium();
        obj.characterArray();
    }
}
