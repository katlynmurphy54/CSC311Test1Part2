//Author: Katlyn Murphy
//Date: 10/02/2020
//Class: CSC 311
//Purpose: Test 1 Part 2. The purpose of this program is to Write a program to show the growth of the 16 complexity functions in 
//Problem 22 of Chapter 1 (page 46 of the Neapolitan Foundations of Algorithms text book).  The growth should be based on the 
//size of the problem (n). For each function, use a table with appropriate scale to show the growth of that function. 
//Please output the tables to a text file or capture the screen output into a file so that we can study them. Study the growth of 
//each function and properly rank them from most efficient (smallest growth) to least efficient (biggest growth). Type the ranking 
//into a Word file.  Justify the ranking with data from the tables.
package katlynmurphytest1part2;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class KatlynMurphyTest1Part2 {
    
    //case 1
    //this function shows the time complexity n ln n. This is lineararithmetic time complexity which it's running time is O(n lg(n)):
    public static double tc1(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = i * Math.log(i);
            System.out.println("n ln n = " + result);
        }
        return result;
    }
    
    //case 2
    //this function shows the time complexity (lg n)^2. This is polyarithmetic time complexity which it's running time is O(lg(n)):
    public static double tc2(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.pow(Math.log(i), 2);
            System.out.println("(lg n)^2 = " + result);
        }
        return result;
    }
    
    //case 3
    //this function shows the time complexity 5n^2 + 7n. This is quadratic time complexity which it's running time is O(n^2):
    public static double tc3(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = (5 * (Math.pow(i, 2))) + (7 * i);
            System.out.println("5n^2 + 7n = " + result);
        }
        return result;
    }
    
    //case 4
    //this function shows the time complexity n^(5/2). This is polynomial time complexity which it's running time is O(2^(o(lgn))):
    public static double tc4(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.pow(i, (5.0/2.0));
            System.out.println("n^(5/2) = " + result);
        }
        return result;
    }
    
    
    //case 5
    //this function shows the time complexity n!. This is factorial time complexity which it's running time is O(n!):
    public static float tc5(int n) 
    { 
        float result = 1, i; 
        for (i=1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result *= i;
            
            System.out.println("n! = " + result);
        }
        return result; 
    } 
    
    //case 6
    //this function shows the time complexity 2^(n!). This is factorial time complexity which it's running time is O(n!):
    public static double tc6(int n) {
        double result = 1, factorial = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            factorial *= i;
            result = Math.pow(2, factorial);
            System.out.println("2^(n!) = " + result);
        }
        return result;
    }
    
    //case 7
    //this function shows the time complexity 4^n. This is double exponential time complexity which it's running time is O(2^(2^n)):
    public static float tc7(int n) {
        float result = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result *= 4;
            System.out.println("4^n = " + result);
        }
        return result;
    }
    
    //case 8
    //this function shows the time complexity n^n. This is polynomial time complexity which it's running time is O(2^(o(lgn))):
    public static double tc8(int n) {
        double result = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.pow(i, i);
            System.out.println("n^n = " + result);
        }
        return result;
    }
    
    //case 9
    //this function shows the time complexity n^n + ln n. This is polynomial time complexity which it's running time is O(2^(o(lgn))):
    public static double tc9(int n) {
        double result = 1.0, total = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result *= n;
            total = result + Math.log(n);
            System.out.println("n^n + ln n = " + total);
        }
        return total;
    }
    
    //case 10
    //this function shows the time complexity 5^(lg n). This is fractional time complexity which it's running time is O(n^a):
    public static double tc10(int n) {
        double result = 1.0, total = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.log(i);
            total = Math.pow(5, result);
            System.out.println("5^(lg n) = " + total);
        }
        return total;
    }
    
    //case 11
    //this function shows the time complexity of lg(n!). This is lineararithmetic time complexity which it's running time is O(n log n):
    public static double tc11(int n) 
    { 
        if (n == 1) {
            System.out.print("n = " + n + ", ");
            System.out.println("Lg(n!) = " + 0);
            return 0;
        }
        else {
            System.out.print("n = " + n + ", ");
            System.out.println("Lg(n!) = " + (Math.log(n)));
            return tc11(n - 1) + Math.log(n);
        } 
    } 
    
    //case 12
    //this function shows the time complexity of lg(n)!. This is polyarithmetic time complexity which it's running time is O(lg(n)):
    public static double tc12(int n) 
    { 
        double result = 1.0, total = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.log(i);
            total *= result;
            System.out.println("lg(n)! = " + total);
        }
        return total;
    } 
    
    //case 13
    //this function shows the time complexity of square root of n. This is fractional time complexity which it's running time is O(n^a):
    public static double tc13(int n) 
    { 
        double result = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.sqrt(i);
            System.out.println("square root of n = " + result);
        }
        return result;
    } 
    
    //case 14
    //this function shows the time complexity of e^n. This is factorial time complexity which it's running time is O(n!):
    public static double tc14(int n) 
    { 
        double result = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.exp(i);
            System.out.println("e^n = " + result);
        }
        return result;
    } 
    
    //case 15
    //this function shows the time complexity of 8n + 12. This is linear time complexity which it's running time is O(n):
    public static double tc15(int n) 
    { 
        double result = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = 8 * i + 12; 
            System.out.println("8n + 12 = " + result);
        }
        return result;
    } 
    
    //case 16
    //this function shows the time complexity of 10^n + n^20. This is exponential and polynomial time complexity
    public static double tc16(int n) 
    { 
        double result = 1.0, total = 1.0;
        for(int i = 1; i <= n; i++) {
            System.out.print("n = " + i + ", ");
            result = Math.pow(10, i);
            total = result + Math.pow(i, 20);
            System.out.println("10^n + n^20 = " + total);
        }
        return total;
    } 
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //call scanner to recieve inputs
        int x, n; //variables for the menu input 
        //n = 5;
        //System.out.println("Factorial of "+ n + " is " + factorial(5));
        //this is to show the growth of the time complexity of lg(n!)
        //n = 5; 
        //System.out.println(factorialLog(n)); 
         while (true) //continuously run menu
        {
            //print out options to user
            System.out.println("1. View n ln n growth: ");
            System.out.println("2. View (lg n)^2 growth: ");
            System.out.println("3. View 5n^2 + 7n growth: ");
            System.out.println("4. View n^(5/2) growth: ");
            System.out.println("5. View n! growth: ");
            System.out.println("6. View 2^(n!) ln n growth: ");
            System.out.println("7. View 4^n growth: ");
            System.out.println("8. View n^n growth: ");
            System.out.println("9. View n^n + ln n growth: ");
            System.out.println("10. View 5^(lg n) growth: ");
            System.out.println("11. View lg(n!) growth: ");
            System.out.println("12. View (lg n)! growth: ");
            System.out.println("13. View square root of n growth: ");
            System.out.println("14. View e^n growth: ");
            System.out.println("15. View 8n + 12 growth: ");
            System.out.println("16. View 10^n + n^20 growth: ");
            System.out.println("17. Exit");
            System.out.println("====================================");
            System.out.println("Please enter a number between 1-17 for the menu option of your choice: ");
            x = in.nextInt();
            switch (x) //call each element in menu by users choice
            {
                case 1:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of " + n + " ln " + n + " is " + tc1(n));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of (lg " + n + ")^2 " + n + " is " + tc2(n));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of 5(" + n + "^2) + 7" + n + " is " + tc3(n));
                    break;
                case 4:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of " + n + "^(5/2) is " + tc4(n));
                    System.out.println();
                    break;
                case 5:
                    //input validation for size of menu
                    System.out.println("Please enter a number for n greater than 0 and less than 51: ");
                    n = in.nextInt();
                    while(n >= 51 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 51.");
                        System.out.println("Please enter a number for n greater than 0 and less than 51: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The factorial of " + n + " is " + tc5(n));
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of 2^(" + n + "!) is " + tc6(n));
                    System.out.println();
                    break;
                case 7:
                    //input validation for size of menu
                    System.out.println("Please enter a number for n greater than 0 and less than 32: ");
                    n = in.nextInt();
                    while(n >= 32 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 32.");
                        System.out.println("Please enter a number for n greater than 0 and less than 32: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The base 4 to the exponent of " + n + " is " + tc7(n));
                    System.out.println();
                    break;
                case 8:
                    //input validation for size of menu
                    System.out.println("Please enter a number for n greater than 0 and less than 16: ");
                    n = in.nextInt();
                    while(n >= 16 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 16.");
                        System.out.println("Please enter a number for n greater than 0 and less than 16: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The base " + n + " to the exponent of " + n + " is " + tc8(n));
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of " + n + "^" + n + " + ln " + n + " is " + tc9(n));
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of 5^(lg " + n + ") is " + tc10(n));
                    System.out.println();
                    break;
                case 11:
                    //input validation for size of menu
                    System.out.println("Please enter a number for n greater than 0 and less than 51: ");
                    n = in.nextInt();
                    while(n >= 50 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 51.");
                        System.out.println("Please enter a number for n greater than 0 and less than 51: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The log(n!) of " + n + " is " + tc11(n)); 
                    break;
                case 12:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of (lg " + n + ")! is " + tc12(n));
                    System.out.println();
                    break;
                case 13:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of the square root of " + n + " is " + tc13(n));
                    System.out.println();
                    break;
                case 14:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of e^" + n + " is " + tc14(n));
                    System.out.println();
                    break;
                case 15:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of 8 * " + n + " + 12 is " + tc15(n));
                    System.out.println();
                    break;
                case 16:
                    System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                    n = in.nextInt();
                    while(n >= 101 || n <= 0) {
                        System.out.println("You must enter a number for n greater than 0 and less than 101.");
                        System.out.println("Please enter a number for n greater than 0 and less than 101: ");
                        n = in.nextInt();
                    }
                    System.out.println("Input: " + n);
                    System.out.println("The result of 10^" + n + " + " + n + "^20 is " + tc16(n));
                    System.out.println();
                    break;
                case 17:
                    System.out.println("Thank you for using my program! "); //exit program
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid input, please try again!");
                    System.out.println();
            }
        }
    }
}