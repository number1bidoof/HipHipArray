import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static int maxDifference(int... list){
        Arrays.sort(list);
        return list[list.length - 1] - list[0];
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String sentence = scanner.nextLine();
        String[] test = sentence.split(" ");
        int[] testing2 = new int[test.length];
        for (int i = 0; i < test.length; i++){
            testing2[i] = Integer.parseInt(test[i]);
        }
        int result = maxDifference(testing2);
        System.out.println("The maximum difference is... " + result);
        scanner.close();
    }
}
