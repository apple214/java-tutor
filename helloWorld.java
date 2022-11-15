import java.util.Scanner;

public class helloWorld {

  public static void main(String[] args) {

    String askInput = new String("Enter the name ('end' to exit)");
    System.out.println(askInput);
    
    Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    System.out.println("Hello " + name + "!");

    String end = new String("end");
    while(!name.equals(end)){
      System.out.println(askInput);
      name = input.nextLine();
      System.out.println("Hello " + name + "!");
    }

    input.close();
  }
}
