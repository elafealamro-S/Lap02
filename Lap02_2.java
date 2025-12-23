/*
 Tipping for service at a restaurant is very common in many countries, and the normal percentage
for tipping is 15%. For example, if you eat at a restaurant and the total bill comes to 50, the
normal tip would be 15% of the 50, which is 7.5. So the total you pay will be 57.5. But perhaps in
another country, 10% is the normal tipping percentage. In this case, the tip would be 5, for a total
of 55. Write a program that reads the subtotal and the desired tip rate. Your program should then
compute the tip, the new total, and should display the results.
 */
 package lap02;
     import java.util.Scanner;

 public class Lap02_2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the subtotal:");
             double subTotal = input.nextDouble();
        
         System.out.print("Enter the tip rate:");
             double tipRate = input.nextDouble();
          
         double tip = (subTotal * tipRate)/100;
         double total = subTotal + tip;    
                  
         System.out.println("The tip is " + tip + " and the total is SAR " + total);
    }
    
}
