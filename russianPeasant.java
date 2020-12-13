import java.util.Scanner;

public class russianPeasant {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Russian Peasant System program!\n");
		System.out.print("Multiplier: ");
		int multiplier = input.nextInt();
		System.out.print("Multiplicand: ");
		int multiplicand = input.nextInt();

	while(multiplicand != 0 || multiplier != 0){
		int er = multiplier;
		int cand = multiplicand;

		if(er < 0 || cand < 0){
			System.out.println("Values must not be negative.\n");
		}

		else if(er == 0 || cand == 0){
			System.out.println("Product: 0\n");
		}

		else{
			while(cand > 1){
				er = er * 2;
				int half = cand/2;
				if (half*2 == cand){
					System.out.println(er + " " + half);
				}
				cand = half;
			}
			System.out.println("Product: " + multiplicand * multiplier + "\n");
		}

		System.out.print("Multiplier: ");
		multiplier = input.nextInt();
		System.out.print("Multiplicand: ");
		multiplicand = input.nextInt();
	}
		input.close();
	}
}

/**
 * 如果相除的两个数都是整数，那么结果也是整数，这叫做取整除法。比如，3/2,结果是1。
 * 如果其中有一个是浮点数，那么就是浮点除法，结果是浮点数，比如，3.0/2,结果是1.5.
 */
