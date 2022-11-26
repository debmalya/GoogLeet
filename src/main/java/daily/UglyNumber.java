package daily;

public class UglyNumber {

	public static boolean isUgly(int n) {
		if (n == 1) {
			return true;
		} else if (n < 1) {
			return false;
		}
		int divisor = 2;
		int maxDivisor = n / 2;
		while (true) {
			while (n % divisor == 0) {
				n /= divisor;
			}
			divisor++;
			if (divisor > 5) {
				return false;
			}
			if (divisor > maxDivisor) {
				break;
			}
		}
		return true;

	}

}
