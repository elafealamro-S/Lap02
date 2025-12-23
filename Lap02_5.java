/*
Write a program that reads an integer between 0 and 1000 and then displays the sum of all the
digits present in the integer.
(Hint : Use a combination of the % operator to extract the last digit and the / operator to remove
the last digit
 */

 package lap02;
 import java.util.Scanner;

 public class Lap02_5 {
      public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("Enter a number between 0 and 1000:");
         
         int number = input.nextInt();
         int sum = number % 10;
         number= number / 10;
         sum += number % 10;
         number= number / 10;
         sum += number % 10;
         System.out.println("The sum of the digits is" + sum);         
    }   
}
