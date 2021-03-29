package tenta202006;

import java.util.Arrays;

public class Uppgift8 {

	public static void crachSeq(int[] x) {

		int[] temp = new int[5];
		int[] temp1 = new int[1];
		int[] temp2 = new int[5];

		for (int b = 0; b < x.length; b++) {	

			for (int a = 0; a < x.length; a++) {
				temp1[0] = x[a];
				System.out.println("ifCrach" + Arrays.toString(temp1));

			}
			
			
			
			
			
		}
	}

	public static void main(String args[]) {
		int[] seq = new int[] { 13, 12, 11, 10, 9 };
		crachSeq(seq);

	}

	// public boolean crach(K,int[]x) {
	// return true;

//	}

}
