/*
 Write a program that asks the user to enter the number of minutes (e.g. 1 billion). Your program
should then display the number of years and days from those minutes. *You can assume that a
year has exactly 365 days.
 */
 package lap02;
  import java.util.Scanner;

 public class Lap02_3 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
        System.out.println("Enter the number of minutes:");
        
         long Minutes = input.nextLong();
         
         long MinutesInDays = 24 * 60;
         long MinutesInYears = 365 * MinutesInDays;
                 
         long remainingMinutes = Minutes % MinutesInYears;
             
         long Years = Minutes / MinutesInYears;
         long Days = remainingMinutes / MinutesInDays;
         
         System.out.println(Minutes + " is approximately " + Years +  " years and " + Days + " days " );
                 
          
             
         
    }
    
}
