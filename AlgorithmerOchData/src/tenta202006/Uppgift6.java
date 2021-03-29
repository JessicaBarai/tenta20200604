package tenta202006;

public class Uppgift6 {
	// ett minne som ska vara o(m) stort kan vaa en circulär buffert som överskriver med storlek m.
	//gör en for loop för alla värden n kan anta tills funktionen retunerar 1, dvs tills n=m
	//förtsa delen av funktionen kan vara kvar eftersom den har konstant tidskostnad 
	
	
	public int verySlow(int n, int m) {
	if (n <= m) {
		 return 1;
	}
	else
	return verySlow(n - 1, m) + verySlow(n - m, m);

}
	
	public int m(int[] prevs, int i, int m) {
		int t1;
		int t2;
		if(i-1<=m) {
			t1=1;
			
		}else {
			t1=prevs[(i-1)% prevs.length];
			
		}
		if(i-m<=m) {
			t2=1;
			
		}else {
			t2=prevs[(i-m)%prevs.length];
			
		}
		return t1+t2; 
			
		
	}
	
	
	public int ratherFast(int n, int m) {
		int[] prevs;
		if (n <= m) {
			 return 1;
		}
		else {
			prevs= new int[m];
		for(int i=0; i<=n; i++) {
			prevs[i%m]=m(prevs, i, m);
			
		}
		return prevs[(m+n)%m];
		}
		
	}
public static void main(String args[]) {
	
System.out.println(String.valueOf("slow"+new Uppgift6().verySlow(7,5)));
System.out.print(String.valueOf("fast"+new Uppgift6().ratherFast(7,5)));	
}

}