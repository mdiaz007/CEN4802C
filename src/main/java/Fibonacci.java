/*
* August 27, 2024
* Module 1
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

        Scanner scan = new Scanner(System.in);

        System.out.print("\nLook for term in Fibonacci sequence: ");
        int n = scan.nextInt();
        scan.close();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(0);
        if (n != 0){
            nums.add(1);
        }


        int x = 0;

        fib(n, nums, x);

        System.out.println("\nFibonacci sequence up until desired term:");
        System.out.println(nums);

    }

    public static void fib(int n, ArrayList nums, int x){

        if (n <= 1){

            if (n == 0){
                System.out.println("The " + n + " term of the Fibonacci sequence is " + nums.get(n) + ".");
            }else if (n == 1){
                System.out.println("The " + n + " term of the Fibonacci sequence is " + nums.get(n) + ".");
            }else{
                System.out.println("Please enter a valid number!");
            }

        }else{

            if (nums.size()-1 != n){
                int iteration = ((int) nums.get(x) + (int) nums.get(x+1));
                x++;
                nums.add(iteration);
                fib(n, nums, x);
            }else{
                System.out.println("The " + n + " term of the Fibonacci sequence is " + nums.get(n) + ".");
            }

        }

    }

}
