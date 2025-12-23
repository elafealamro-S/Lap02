/*
 *Ask a user to enter his/her full name and their sex for a hotel reservation then display the
information as shown in the sample run.
 */
package lap02;
 import java.util.Scanner;

public class Lap02_6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("Please enter your full name :");
        String name = input.nextLine();
        
        System.out.println("Sex :");
        String sex = input.nextLine();
        
        System.out.println("A reservation has been made for the following guest :");
        System.out.println("\t"+name+"("+sex+")");
    }
    
}
