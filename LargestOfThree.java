// Largest of Three Program
// Caleb Bergen
// 2/16/23

import java.util.Scanner;

public class LargestOfThree
{
    public static void main(String[] args){        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;
        int largest = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter a second number: ");
        num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter one last number: ");
        num3 = Integer.parseInt(scanner.nextLine());
        
        sum = num1 + num2 + num3;
        
        System.out.println("\nThe sum of the numbers " + num1 + ", " + num2 + ", and " + num3 + " is " + sum);
        
        if(num1 > num2){
            if(num1 > num3){
                largest = num1;
            }else{
                largest = num3;
            }
        }else{
            if(num2 > num3){
                largest = num2;
            }else{
                largest = num3;
            }
        }
        
        System.out.println("\nThe largest number of " + num1 + ", " + num2 + ", and " + num3 + " is " + largest);
    }
}
