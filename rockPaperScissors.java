import java.util.Scanner;

/**
Write a program that plays rock, paper, scissors until a player reaches 3 wins.
    ● Rock beats scissors.
    ● Paper beats rock.
    ● Scissors beat paper.
 */

public class rockPaperScissors {
  public static void main(String[] args) {
    //定义胜场
    int win1 = 0;
    int win2 = 0;
    int[] wins = new int[2];
    wins[0] = win1;
    wins[1] = win2;

    Game game = new Game();
    while(wins[0] <3 && wins[1] < 3) {
      //要求输入
      System.out.print("Player 1, pick either rock, paper, or scissors: ");
      Scanner scanner = new Scanner(System.in);
      String player1 = scanner.nextLine();
      System.out.print("Player 2, pick either rock, paper, or scissors: ");
      String player2 = scanner.nextLine();
      System.out.println();

      game.play(player1, player2, wins);
    }

  }

}

//游戏规则
class Game{
  public int[] play(String player1, String player2, int[] wins) {
    //输入无效
    if (!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors")
        && !player2.equals("rock") && !player2.equals("paper") && !player2.equals("scissors")) {
      System.out.println("No contest.");
    }

    //输入有效
    else {
      //平局
      if (player1.equals(player2)) {
        System.out.println("Tie game.");
      }

      //player1赢
      if (player1.equals("paper") && player2.equals("rock")) {
        System.out.println("Player 1 wins!");
        wins[0] += 1;
      }
      if (player1.equals("rock") && player2.equals("scissors")) {
        System.out.println("Player 1 wins!");
        wins[0] += 1;
      }
      if (player1.equals("scissors") && player2.equals("paper")) {
        System.out.println("Player 1 wins!");
        wins[0] += 1;
      }

      ////player2赢
      if (player2.equals("paper") && player1.equals("rock")) {
        System.out.println("Player 2 wins!");
        wins[1] += 1;
      }
      if (player2.equals("rock") && player1.equals("scissors")) {
        System.out.println("Player 2 wins!");
        wins[1] += 1;
      }
      if (player2.equals("scissors") && player1.equals("paper")) {
        System.out.println("Player 2 wins!");
        wins[1] += 1;
      }

    }
    return wins;
  }
}
