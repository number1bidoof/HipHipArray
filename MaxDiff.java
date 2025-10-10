/*
Name: Ayah Abdalla
Date: 10/03/2025
Description: A method that gets the maximum difference between a list of numbers 
*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxDiff {

    public static int maxDifference(int... list){
        Arrays.sort(list); // sorts the list to make it easier 
        return list[list.length - 1] - list[0]; // last(greatest) - first(least) number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        
        String sentence = scanner.nextLine();
        String[] test = sentence.split(" "); // splits the string by spaces into a list
        int[] testing2 = new int[test.length]; // makes an empty list to based on the # of numbers entered 

        for (int i = 0; i < test.length; i++){
            testing2[i] = Integer.parseInt(test[i]); // converts the string into integers and puts it in an index value
        }

        int result = maxDifference(testing2); // asigns it to a varrible
        System.out.println("Maximum Difference: " + result);
        scanner.close(); // to prevent memory leaks
    }
}
