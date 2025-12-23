/*
 Given an airplane’s acceleration (a) and take-off speed (v), the minimum runway length needed
for an aircraft to takeoff is calculated using the following formula
𝑣!
𝑙𝑒𝑛𝑔𝑡ℎ =
2𝑎
Write a program that prompts the user to enter v (in m/s) and the acceleration a (in m/s2) and then
calculates and displays the minimum runway length.
 */
 package lap02;
    import java.util.Scanner;

 public class Lap02_4 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in).;
        
         System.out.println("Enter speed and acceleration of the aircraft:");
         double speed = input.nextDouble();
         double acceleration = input.nextDouble();
         double length = ((speed*speed)/(2*acceleration));
         
         System.out.println("he minimum runway length for this aircraft is " + length);      
    }
}
