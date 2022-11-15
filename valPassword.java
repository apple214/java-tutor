import java.util.Scanner;

public class valPassword {
  public static void main(String[] args) {
    //input 
    System.out.print("Enter a new password: ");
    Scanner scanner = new Scanner(System.in);
    String password = scanner.nextLine();

    int capital = 0, number = 0, other = 0;
    char [] passwordArr = password.toCharArray();
    int length = passwordArr.length;
    for(int i=0; i<length; i++){
      if(passwordArr[i]>= 'A' && passwordArr[i] <= 'Z'){
        capital = 1;
      }
      else if(passwordArr[i] >= '0' && passwordArr[i] <= '9'){
        number = 1;
      }
      else if(passwordArr[i] == '_'){
        other = 0;
      }
      else if(passwordArr[i]>= 'a' && passwordArr[i] <= 'z'){
        other = 0;
      }
      else {
        other = 1;
      }
    }
    if(capital == 1 && number == 1 && other == 0){
      System.out.println("Password accepted.");
    }
    else{
      System.out.println("Invalid password.");
    }

    scanner.close();
  }
}
