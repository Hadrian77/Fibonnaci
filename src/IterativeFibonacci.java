
public class IterativeFibonacci {

	public static void findEntry(int sequenceEntry) {

		long startTime;
		long endTime;

		startTime = System.nanoTime();

		int[] sequence;

		sequence = new int[sequenceEntry];
		sequence[0] = 0;
		sequence[1] = 1;

		for (int i = 2; i < sequenceEntry; i++) {

			sequence[i] = sequence[i - 2] + sequence[i - 1];

		}

		endTime = System.nanoTime();

		System.out.println("Iterative\nInput was: " + sequenceEntry + " | Output was: " + sequence[sequenceEntry - 1]
				+ "\nIt took " + (endTime - startTime) + " nanoseconds\n");

		return;

	}

}
