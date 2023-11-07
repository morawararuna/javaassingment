package recursion;

public class ArraySum {

	public static void main(String[] args) {
		int []n= {10,20,30,40,50,78};
		System.out.println(sumArr(n,n.length-1));

	}

	private static int sumArr(int[] n, int size) {
	
		if(size==0)return n[0];
		else return n[size]+sumArr(n,size-1);
	}

}
