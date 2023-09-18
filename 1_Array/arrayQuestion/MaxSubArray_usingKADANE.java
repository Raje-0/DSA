package arrayQuestion;

public class MaxSubArray_usingKADANE {
	public static void kadane(int no[]) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		for (int i = 0; i < no.length; i++) {
			cs = cs + no[i];
			if (cs < 0) {
			}

			ms = Math.max(ms, cs);
		}
		System.out.println("our max sub array sum is: " + ms);
	}

	public static void main(String[] args) {
		int no[] = { 1, 2, 3, 4, 5 };
		kadane(no);
	}
}
