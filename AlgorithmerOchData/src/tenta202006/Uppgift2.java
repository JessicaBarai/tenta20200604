package tenta202006;

public class Uppgift2 {
	
	
	private int m;
	private int n;
	private Integer[] keys;
	private Integer[] vals;
	
	
	public Uppgift2() {
		m=10;
		n=0;
		keys= new Integer[m];
		vals= new Integer[m];
	}
	
	private int hash(Integer key){
		return (key.hashCode() & 0x7fffffff) %m;
		
	}
	
	
	public void put(Integer key, Integer value) {
		int i;
		for(i=hash(key); keys[i]!= null; i=(i+1)%m) {
			if(keys[i].equals(key)) {
				vals[i]=value;
				return;
				
			}
			
			
			
		}
		keys[i]=key;
		vals[i]=value;
		n++;
	}
	
	public Integer get(Integer key) {
		for(int i= hash(key); keys[i]!=null; i= (i+3)% m) {
			if(keys[i].equals(key)) {
				return vals[i];
				
			}
			
			
		}
		return null;
		
	}
	@Override
	public String toString() {
		StringBuilder k= new StringBuilder();
		StringBuilder v= new StringBuilder();
		for(int i=0; i<10;i++) {
			k.append(keys[i]);
			
		}
		for(int i=0; i<10;i++) {
			v.append(vals[i]);
			
		}
		return k.toString()+ "\n"+ v.toString();
	}
	
	public static void main(String [] args) {
		Uppgift2 upp= new Uppgift2();
		upp.put(1,1);
		upp.put(9,9);
		upp.put(9,9);
		upp.put(5,5);
		upp.put(0,0);
		upp.put(7,7);
		upp.put(2,2);
		upp.put(6,6);
		upp.put(4,4);
		upp.put(3,3);
		upp.put(6,6);
		upp.put(5,5);
		System.out.print(upp.toString());
		
	}
	

}
