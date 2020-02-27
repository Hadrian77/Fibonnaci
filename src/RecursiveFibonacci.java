
public class RecursiveFibonacci {

	private static int fibo(int n) {

		if (n < 2) {
			return n;
		}

		else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}

	public static void findEntry(int sequenceEntry) {

		long startTime;
		long endTime;
		int result;

		startTime = System.nanoTime();

		result = fibo(sequenceEntry);

		endTime = System.nanoTime();

		System.out.println("Recursive\nInput was: " + sequenceEntry + " | Output was: " + result + "\nIt took "
				+ (endTime - startTime) + " nanoseconds\n");

		return;
	}

}
