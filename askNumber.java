import java.util.Scanner;

public class askNumber {

  public static void main(String[] args){
    //ask for input
    String askInput = new String("Enter number 157: ");
    System.out.print(askInput);

    //input
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    //set target
    int targetNum = 157;

    while(number != targetNum){
      System.out.print(askInput);
      number = input.nextInt();
    }

    System.out.print("Thank you!");

    //good habit
    input.close();
  }
}
