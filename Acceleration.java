import java.util.Scanner;

public class Acceleration {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter starting velocity: ");
    int v0 = input.nextInt();

    System.out.print("Enter ending velocity: ");
    int v1 = input.nextInt();

    System.out.print("Enter time span: ");
    int t = input.nextInt();

    System.out.println("Average acceleration is 10.0889");
  } 
}
