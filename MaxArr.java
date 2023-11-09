package interfaces;

interface MAxArr1 {
	int findMax(int[] num);
}

public class MaxArr {

	public static void main(String[] args) {
		int[] n= {10,90,20,30};
		MAxArr1 marr=(num)->{
			int temp=n[0];
		for( int i=0;i<n.length;i++) {
	
				if(n[i]>temp) {
						temp=n[i];
				}
		}
		return temp;
	};
		System.out.println(marr.findMax(n));

	}
}
