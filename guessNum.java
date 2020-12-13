import java.util.Random;
import java.util.Scanner;

public class guessNum {
  public static void main(String[] args){
    Random random = new Random();
    int target = random.nextInt(99);
    target = target + 1;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Take a guess: ");
    int guess = scanner.nextInt();
    int i = 0;
    while(guess != target){
      if (guess < target){
        System.out.println("Too low!");
        i = i+1;
      }
      else{
        System.out.println("Too high!");
      }
      System.out.print("Take a guess: ");
      guess = scanner.nextInt();
    }
    System.out.println("Bingo! The correct answer is " + target);

    scanner.close();
  }
}
