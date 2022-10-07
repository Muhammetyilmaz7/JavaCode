package github;

public class git {

	// result -> sonuç
	// index -> dizin
	// value -> değer
	public static void main(String[] args) {
		int result = 1, index = 1, value;
		while (index < 10) {
			value = exponentCalculate(result, index) - 1;
			result = 1;
			if (isTheNumberPrime(value) == false) {
				System.out.println(
						"2^p-1 in the process, p for " + index + " when written " + value + " number is prime!");
				System.out.println();
				value = CalculatePerfectNumber(index);
				System.out.println("2^(P-1) x 2^P-1 in the process, p for " + index + " ->> " + value
						+ " is the perfect number!\n");
				showDivisor(value);
				System.out.println("\n");
				System.out.println();
			}
			index++;
		}
	}

	static int CalculatePerfectNumber(int P) {
		int temp1 = 1, temp2 = 1;
		int P1 = P;
		for (int i = 1; i > 0; i++) {
			temp1 *= 2;
			if (P == 2) {
				break;
			}
			P--;
		}
		for (int i = 1; i > 0; i++) {
			temp2 *= 2;
			if (P1 == 1) {
				temp2 -= 1;
				break;
			}
			P1--;
		}
		return temp1 * temp2;
	}

	static int exponentCalculate(int conclusion, int y) {
		conclusion *= 2;
		if (y == 1) {
			return conclusion;
		} else {
			y--;
			return exponentCalculate(conclusion, y);
		}
	}

	static boolean isTheNumberPrime(int P) {
		int j = 2;
		if (P < 2) {
			return true;
		}
		while (j <= P / 2) {
			if (P % j == 0) {
				return true;
			}
			j++;
		}
		return false;
	}

	static void showDivisor(int number) {
		int j = 2;
		System.out.println("Equality is shown below:");
		while (j <= number) {
			if (number % j == 0) {
				System.out.print(number / j);
				if (j == number) {
					System.out.print(" = " + number);
					System.out.println("\n\n\n**********************");
				}
				if (j != number) {
					System.out.print(" + ");
				}
			}
			j++;
		}
	}
}
