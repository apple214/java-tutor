import java.util.Scanner;

public class calPrice {
  public static void main(String[] args){
    System.out.print("How many grams does the mail weigh? ");

    Scanner input = new Scanner(System.in);
    int weight = input.nextInt();

    float cost = 0;

    if(weight <= 30){
      cost = 4;
    }
    if(weight > 30 &&  weight <= 50){
      cost = 5.5f; //no f if double
    }
    if(weight > 50 &&  weight <= 100){
      cost = 7;
    }

    //over weight
    if(weight > 100){
      cost = 7;
      int rest = weight - 100;
      for(rest = rest; rest > 0; rest = rest - 50){
        cost += 2.50;
      }
    }

    System.out.print("The cost to mail this letter is $" + cost);

    //good habit
    input.close();
  }
}
