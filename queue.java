import java.io.FileNotFoundException;
import java.util.LinkedList;

public class queue {
  public static void main(String[] args) throws FileNotFoundException{
    LinkedList<String> nameQ = new LinkedList<String>();
    nameQ.add("Lian");
    nameQ.add("Kang");

    System.out.println(nameQ.remove());
    System.out.println(nameQ.remove());
  }
}
