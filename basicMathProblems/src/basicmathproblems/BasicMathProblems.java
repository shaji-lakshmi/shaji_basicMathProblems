/*
This program contains methods that take in user input to carry out basic mathematical operations. Main objective of this 
program is to utilize scanners to read user inputs and produce an output using prewritten methods so that the main method 
is not overloaded with lines of code conducting the mathematical operations.
*/
package basicmathproblems;

import java.util.Scanner;

/**
 *
 * @author Lakshmi Shaji
 */
public class BasicMathProblems {

    public static int addThem(int aNum, int bNum) {
        int finalAnswer;
        finalAnswer = aNum + bNum;
        return finalAnswer;
    }

    public static int subtractThem(int aNum, int bNum) {
        int finalAnswer;
        finalAnswer = aNum - bNum;
        return finalAnswer;
    }

    public static int multiplyThem(int aNum, int bNum) {
        int finalAnswer;
        finalAnswer = aNum * bNum;
        return finalAnswer;
    }

    public static int divideThem(int aNum, int bNum) {
        int finalAnswer;
        finalAnswer = aNum / bNum;
        return finalAnswer;
    }

    public static int modularDivision(int aNum, int bNum) {
        int finalAnswer;
        finalAnswer = aNum % bNum;
        return finalAnswer;
    }
    

    public static int factorial(int factNum) {
        int finalAnswer = 1;
        for (int i = 1; i <= factNum; i++) {
            finalAnswer = finalAnswer * i;
        }
        return finalAnswer;
    }

    public static int findSumofAll(int input) {
        int finalAnswer = 0;
        for (int i = 0; i <= input; i++) {
            finalAnswer += i;
        }
        return finalAnswer;
    }
    
    public static int squared(int input){
        int finalAnswer; 
        finalAnswer = input *input;
        return finalAnswer; 
    }

    public static void main(String[] args) {

        Scanner inputFirstNum = new Scanner(System.in);
        System.out.println("Enter Your First Input: ");
        int firstInput = inputFirstNum.nextInt();

        Scanner inputSecondNum = new Scanner(System.in);
        System.out.println("Enter Your Second Input: ");
        int secondInput = inputSecondNum.nextInt();

        System.out.println("");
        System.out.println("Your sum is: " + addThem(firstInput, secondInput));
        System.out.println("Your difference is: " + subtractThem(firstInput, secondInput));
        System.out.println("Your product is: " + multiplyThem(firstInput, secondInput));
        System.out.println("Your quotient is: " + divideThem(firstInput, secondInput));
        System.out.println("Your remainder from dividing inputs is: " + modularDivision(firstInput, secondInput));
        System.out.println("");

        Scanner factorialInput = new Scanner(System.in);
        System.out.println("Enter an input to calculate factorial: ");
        int factorialNum = factorialInput.nextInt();
        System.out.println(factorialNum + " factorial: " + factorial(factorialNum));

        System.out.println("");
        Scanner findSum = new Scanner(System.in);
        System.out.println("Enter input to calculate the sum of all number upto given input:  ");
        int addedSum = findSum.nextInt();
        System.out.println("The sum of all numbers upto " + addedSum + " : " + findSumofAll(addedSum));

        System.out.println("");
        Scanner squareNum = new Scanner(System.in);
        System.out.println("What number would you like to square?");
        int squared = squareNum.nextInt();
        System.out.println(squared + " squared is: " + squared(squared));
    }

}
