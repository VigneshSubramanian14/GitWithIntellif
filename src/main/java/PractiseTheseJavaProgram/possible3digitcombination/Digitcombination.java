package PractiseTheseJavaProgram.possible3digitcombination;

public class Digitcombination {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        for (int x = 0; x < input.length; x++) {
            for (int y = 0; y < input.length; y++) {
                for (int z = 0; z < input.length; z++) {
                    if (x != y && y != z && z != x) {
                        System.out.println(input[x] + "" + input[y] + "" + input[z]);
                    }
                }
            }
        }
    }
}