

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSplit {
    public static int[] getEvens(int[] nums) {
        int countEvens = 0;
        int[] evenNum = new int[nums.length];
        for (int i : nums) {
            if (i % 2 == 0) {
                evenNum[countEvens++] = i;
            }
        }
        return evenNum;
    }

    public static int[] getOdds(int[] nums) {
        int countOdds = 0;
        int[] oddNum = new int[nums.length];
        for (int i : nums) {
            if (i % 2 != 0) {
                oddNum[countOdds++] = i;
            }
        }
        return oddNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 15 integers with one space between each integer:");
        int[] userList;
        userList = new int[15];
        for (int i = 0; i < userList.length; i++) {
            userList[i] = scanner.nextInt();
        }
        int[] evens = getEvens(userList);
        int[] odds = getOdds(userList);
        System.out.print("Even numbers: ");
        for (int j : evens) {
            if (j != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Odd numbers: ");
        for(int h: odds){
            if(h != 0) {
            System.out.print(h + " ");
            }
        }
    }
}