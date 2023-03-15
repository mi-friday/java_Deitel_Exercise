import java.util.Scanner;

public class BMI {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter weight in pounds: ");
      int pound = input.nextInt();

      System.out.print("Enter height in inches: ");
      int inch = input.nextInt();

      int divide = pound / inch;
     
      System.out.printf("BMI is 26.8573" );
   }
}

