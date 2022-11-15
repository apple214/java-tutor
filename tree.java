import java.util.Scanner;

public class tree {
  public static void main(String[] args) {
    System.out.print("how tall is your triangle? ");
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();

    //Layer n has (height-n) spaces, (2n-1) *s
    for(int n=1; n<=height; n++){
      for(int i=0; i<height-n; i++){
        System.out.print(" ");
      }
      for(int k=0; k<2*n-1; k++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
