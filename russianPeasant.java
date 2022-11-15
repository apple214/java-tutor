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
  * If the two numbers being divided are integers, then the result is also an integer, which is called division by rounding. For example, 3/2, the result is 1.
  * If one of them is a floating-point number, then it is a floating-point division, and the result is a floating-point number, for example, 3.0/2, the result is 1.5.
  */
