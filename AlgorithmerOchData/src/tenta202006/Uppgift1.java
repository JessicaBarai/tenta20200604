package tenta202006;

public class Uppgift1 {

	/**
	 * @pre s != null && m != null
	 * @param s the sequence to do the matching in.
	 * @param p the pattern to match.
	 * @return The index to the first occurence of p in s. * @return -1 if p does
	 *         not occur in s.
	 */
	public static int match1(final int[] s, final int[] p) {
		for (int i = 0; i <= s.length - p.length; i++) {
			int j;
			for (j = 0; j < p.length; j++) {
				if (s[i + j] != p[j]) { //C
					
					break;
				}
			}
			if (j == p.length) {
				
				return i;
			}
		}
		return -1;

	}

	// More cleverer version?
	// Example: Match {1, 2} in {1, 3, 1, 2, 3} =>
	// after finding the first 3, skips ahead to the second 1, then finds {1, 2} at
	// 2. /** Supposedly a faster drop-in replacement for match1. */
	public static int match2(final int[] s, final int[] p) {
		for (int i = 0; i <= s.length - p.length; i++) {
			int j;
			for (j = 0; j < p.length; j++) {
				if (s[i + j] != p[j]) {
					i =i+ j; // Mismatch, skip ahead.
					break;

				}
			}
			if (j == p.length) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String arrgs[]) {
		final int[] s= new int[]{1,1,2};
		final int[] p= new int[] {1,2};
		
		System.out.println(String.valueOf(match1(s,p)));
		System.out.println(String.valueOf(match2(s,p)));

		
	}

}
