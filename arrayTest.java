import java.util.Arrays;
import java.util.Scanner;

public class arrayTest {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] ages = new int[size];
    //int[] ages = {10,9,8};
    ages[1] = 200;
    System.out.println(ages[0]);

    try{
      System.out.println(ages[3]);
    } catch (
        Exception e
    ){
      System.out.println(e);
    }


    for(int i=0; i<ages.length; i++){
      int x = scanner.nextInt();
      ages[i] = x;

      if(ages[i] == 20){
        System.out.println("Found at index" + i);
      }
    }

    Arrays.sort(ages);
    Arrays.parallelSort(ages);
    System.out.println(Arrays.toString(ages));

    int ages2[] = {1,2,3};
    if(ages.equals(ages2)){
      System.out.println("bingo");
    }

    if(Arrays.equals(ages,ages2)){
      System.out.println("finally");
    };

    Arrays.fill(ages, 100);

    scanner.close();
  }
}
