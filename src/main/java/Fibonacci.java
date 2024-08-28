/*
* August 27, 2024.
* Module 1 - Assignment 1
* Instructions:
*
* Implement a Java class that contains two methods:
*
* (1) A recursive static method that returns the nth term in the Fibonacci sequence.
* The method should accept n as a parameter. Do not include javadoc code in your
* implementation (yet).
*
* (2) A main method that calls the first method.
* Pass in 10 as an argument. Output the 10th term of the Fibonacci
* sequence along with some descriptive text, e.g. "The nth term of
* the Fibonacci sequence is y." Don't hard-code the results; output
* the appropriate variables.
*
* */

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        // A scanner object for scanning user input.
        Scanner scan = new Scanner(System.in);

        System.out.print("\nLook for term in Fibonacci sequence: ");
        int n = scan.nextInt();

        // Closing scanner, will not be used anymore during the program.
        scan.close();

        // ArrayList for holding numbers of the fibonacci sequence.
        ArrayList<Integer> nums = new ArrayList<>();

        // Sets the first two numbers of the fibonacci sequence.
        nums.add(0);
        if (n != 0){
            nums.add(1);
        }

        // Counter for the recursive method.
        int x = 0;

        // Calls the method for finding a specified term of the fibonacci sequence.
        fibonacciRecursive(n, nums, x);

        System.out.println("\nFibonacci sequence up until desired term:");

        // Prints the ArrayList of the fibonacci sequence up until desired term.
        System.out.println(nums);

    }

    /**
    * This method finds the desired term of the fibonacci sequence.
    * The method takes three 3 parameters n, nums, and x.
    * @param n is the requested term by the user of the fibonacci sequence.
    * @param nums is an ArrayList that stores fibonacci number on each method call.
    * @param x is a counter for calculating the fibonacci numbers on each method call.
    *
    * */
    public static void fibonacciRecursive(int n, ArrayList<Integer> nums, int x){

        if (n <= 1){

            if (n == 0){
                System.out.println("Term " + n +  " of the Fibonacci sequence is " + nums.get(n) + ".");
            }else if (n == 1){
                System.out.println("Term " + n +  " of the Fibonacci sequence is " + nums.get(n) + ".");
            }else{
                System.out.println("Please enter a valid number!");
            }

        }else{

            if (nums.size()-1 != n){
                int iteration = (nums.get(x) + nums.get(x+1));
                x++;
                nums.add(iteration);
                fibonacciRecursive(n, nums, x);
            }else{
                System.out.println("Term " + n +  " of the Fibonacci sequence is " + nums.get(n) + ".");
            }

        }

    }

}
