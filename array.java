import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(new File("name"));
    List<String> name = new ArrayList<>();
    while (input.hasNextLine()){
      name.add(input.nextLine());
    }

    for(int i = 0; i < name.size(); i++){
      System.out.println((i+1) + ": " + name.get(i));
    }

    input.close();
  }
}

/**
 * Java exception handling is mainly controlled by five keywords: try, catch, throw, throws and finally. try means to try whether an exception will occur in the code segment it contains; catch catches it when there is an exception, and handles it accordingly, so that the program is not affected by the exception and continues to execute; throw is in the program The function of throws is that if a method can throw an exception, but it does not handle the exception itself, then it must throw the exception to the method that calls it; finally is executed regardless of whether an exception occurs or not. code
 *
 * Keywords: throw, throws, try and catch are used as follows:
 * 1. throws appears in the declaration of the method, indicating the exception that the method may throw, allowing throws to be followed by multiple exception types
 * 2. throw appears in the method body and is used to throw exceptions. When the method encounters an exception during execution, the exception information is encapsulated as an exception object, and then thrown.
 * 3. try appears in the method body, which itself is a code block, indicating the statement that tries to execute the code block. If a statement throws an exception during execution, the statements following the code block will not be executed.
 * 4. The catch appears after the try code block and is itself a code block, used to catch exceptions that may be thrown in the exception try code block. The catch keyword is followed by the exception type that it can catch, and all subclass exceptions of the exception type can also be caught.
 */
