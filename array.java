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
 * Java异常处理主要通过5个关键字控制：try、catch、throw、throws和finally。try的意思是试试它所包含的代码段中是否会发生异常；而catch当有异常时抓住它，并进行相应的处理，使程序不受异常的影响而继续执行下去；throw是在程序中明确引发异常；throws的作用是如果一个方法可以引发异常，而它本身并不对该异常处理，那么它必须将这个异常抛给调用它的方法；finally是无论发不发生异常都要被执行的代码
 *
 *     关键字:throw,throws,try和catch的用法如下：
 *         1、throws出现在方法的声明中，表示该方法可能会抛出的异常，允许throws后面跟着多个异常类型
 *         2、throw出现在方法体中，用于抛出异常。当方法在执行过程中遇到异常情况时，将异常信息封装为异常对象，然后throw。
 *         3、try出现在方法体中，它自身是一个代码块，表示尝试执行代码块的语句。如果在执行过程中有某条语句抛出异常，那么代码块后面的语句将不被执行。
 *         4、catch出现在try代码块的后面，自身也是一个代码块，用于捕获异常try代码块中可能抛出的异常。catch关键字后面紧接着它能捕获的异常类型，所有异常类型的子类异常也能被捕获。
 */