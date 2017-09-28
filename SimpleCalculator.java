import java.util.Scanner;

/**
 * SimpleCalculator.java
 * <p>
 * Four function calculator that performs addition, subtraction,
 * multiplication, and division.
 * <p>
 * This class is missing code and it is to be filled out during
 * the GWU ACM Git workshop
 *
 * @author Neel Shah (github.com/nks5295)
 * @author Phil Lopreiato (github.com/phil-lopreiato)
 * @version 1.0
 *
 */
public class SimpleCalculator {

	private static final int ERROR = -1234567890;

	public SimpleCalculator() {
	}

	/**
     * Main entry point for the program
     *<p>
	 * Continuously loops and asks for two numbers and an operation.
	 * If the operation is accepted, it will run that operation
	 * against the two inputted numbers and print the result.
	 */
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		Scanner scanner = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int result = ERROR;
		String operand = null;

		while (true) {
			System.out.print("Enter num1: ");
			num1 = scanner.nextInt();

			System.out.print("Enter num2: ");
			num2 = scanner.nextInt();

			System.out.print("Enter operand (+, -, *, /): ");
			operand = scanner.next();

			switch (operand) {
				case "+":
					// TODO: Add the numbers
					break;
				case "-":
					// TODO: Subtract the numbers
					break;
				case "*":
					// TODO: Multiply the numbers
					break;
				case "/":
					// TODO: Divide the numbers
					break;
				default:
					System.out.println("Not a valid operand, try again.");
					result = ERROR;
					break;
			}

			if (result != ERROR) {
				System.out.println(num1+" + "+num2+" = "+result);

				System.out.print("Go again? (y/n): ");
				String repeat = scanner.next();

				if (repeat.equals("n")) return;

				System.out.println();
			}
		}
	}

    /**
	 * Perform addition
	 * @param num1 first addition operand
	 * @param num2 second addition operand
	 * @return An integer that is the sum of the arguments
	 */
	private int add(int num1, int num2) {
		// TODO: Complete this method
		return 0;
	}

	/**
	 * Perform subtraction
	 * @param num1 first subtraction operand
	 * @param num2 second subtraction operand
	 * @return An integer that is the difference of the arguments
	 */
	private int subtract(int num1, int num2) {
		// TODO: Complete this method
		return 0;
	}

	/**
     * Perform multiplication
	 * @param num1 first multiplication operand
	 * @param num2 second multiplication operand
	 * @return an integer that is the product of the arguments
	 */
	private int multiply(int num1, int num2) {
		// TODO: Complete this method
		return 0;
	}

	/**
     * Perform division
     * <p>
     * This method does not account for the truncation that
     * occues during integer divsion
     *
	 * @param num1 first division operand
	 * @param num2 second division operand
	 * @return An integer that is the quotient of the arguments
	 */
	private int divide(int num1, int num2) {
		// TODO: Complete this method
		return 0;
	}

}
