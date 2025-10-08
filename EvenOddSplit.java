/*
Name: Ayah Abdalla
Date: 10/03/2025
Description: Splits an array of 15 numbers by even or odd
*/

import java.util.Scanner;

public class EvenOddSplit {
    public static int[] getEvens(int[] nums) {
        int countEvens = 0; // index value
        int[] evenNum = new int[nums.length]; // makes an empty list for the even numbers
        for (int number : nums) {
            if (number % 2 == 0) { // if the number is even
                evenNum[countEvens++] = number; // adds number to the array, increments by one for the next index
            }
        }
        return evenNum; // returns the array of even number
    }

    public static int[] getOdds(int[] nums) {
        int countOdds = 0; // index value
        int[] oddNum = new int[nums.length]; // makes an empty list for the odd numbers
        for (int number : nums) {
            if (number % 2 != 0) { // if the number is odd
                oddNum[countOdds++] = number; // adds number to the array, increments by one for the next index
            }
        }
        return oddNum; // returns the array of odd numbers
    }
    public static int[] formatOutput(int[] nums){ // for readability and better interface
        for(int i : nums){ // for each number in the array
            if(i != 0) { // if it is not 0 (meaning the value didnt get filled in)
            System.out.print(i + " ");  // prints it out
            }
        }
        System.out.println(" ");
        return nums; // returns the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 15 integers with one space between each integer:");
        int[] userList;
        userList = new int[15]; // is a set number
        for (int i = 0; i < userList.length; i++) { 
            userList[i] = scanner.nextInt(); // assigns the number to an index
        }
        int[] evens = getEvens(userList); // seperate array for even numbers
        int[] odds = getOdds(userList); // seperate array for odd numbers

        System.out.print("Even Numbers: ");
        formatOutput(evens); // formats the output

        System.out.print("Odd Numbers: ");
        formatOutput(odds); // formats the output

        scanner.close(); // closes the scanner
    }
}