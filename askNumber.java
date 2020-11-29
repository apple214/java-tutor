import java.util.Scanner;

public class askNumber {

  public static void main(String[] args){
    //请求输入
    String askInput = new String("Enter number 157: ");
    System.out.print(askInput);

    //输入数字
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    //规定目标
    int targetNum = 157;

    while(number != targetNum){
      System.out.print(askInput);
      number = input.nextInt();
    }

    System.out.print("Thank you!");

    //好习惯
    input.close();
  }

}
