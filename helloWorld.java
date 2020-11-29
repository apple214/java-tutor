import java.util.Scanner;

public class helloWorld {

  public static void main(String[] args) {
    //请求输入
    String askInput = new String("Enter the name ('end' to exit)");
    System.out.println(askInput);

    //输入名字
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    //输出你好
    System.out.println("Hello " + name + "!");

    //判断是否为中止指令
    String end = new String("end");
    while(!name.equals(end)){
      System.out.println(askInput);
      name = input.nextLine();
      System.out.println("Hello " + name + "!");
    }

    //好习惯
    input.close();
  }
}
