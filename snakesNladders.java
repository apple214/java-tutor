import java.util.Scanner;

public class snakesNladders {
  public static void main(String[] args) {

    Rules rules = new Rules();
    //location
    int location = 1;
    while (location < 100){
      //roll the dice
      System.out.print("Enter roll: ");
      Scanner scanner = new Scanner(System.in);
      int dice = scanner.nextInt();

      dice = rules.diceCheck(dice);
      if(dice == 0){
        break;
      }

      if(100-location < dice){
        continue;
      }
      if(100-location == dice){
        System.out.println("You Win!");
        break;
      }

      location += dice;
      //cal location
      location = rules.specialLocations(location);
      System.out.println("You are on square " + location);
    }

}

static class Rules{
  public int specialLocations(int location){
    //ladder
    if (location == 9){
      location = 34;
    }
    if (location == 40){
      location = 64;
    }
    if (location == 67){
      location = 86;
    }
    //snack
    if (location == 54){
      location = 19;
    }
    if (location == 90){
      location = 48;
    }
    if (location == 99){
      location = 77;
    }

    return location;
  }
  public int diceCheck(int dice){
    Scanner scanner = new Scanner(System.in);
    if(dice >= 2 && dice <= 12){
    }
    else if(dice != 0){
      System.out.print("Please enter a number between 2 and 12: ");
      int newDice = scanner.nextInt();
      dice = diceCheck(newDice);
    }
    if(dice == 0){
      System.out.println("You quit!");
      dice = 0;
    }
    return dice;
  }
  }
}

