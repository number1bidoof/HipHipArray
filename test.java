import java.util.Scanner;

public class test {
    public static int maxDifference(int... list){
        int listMax = list[0];
        int listMin = list[0];
        return(listMax - listMin);
        
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

    }
}
