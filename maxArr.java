package recursion;

public class maxArr {
	static int max=0;
	static int maxarr1(int[] n,int size) {
	if(size==-1) return max;
	else {
		if(max<n[size]) {
			max=n[size];
			return maxarr1(n,size-1);
		}
		else return maxarr1(n,size-1);
	}
	}

	public static void main(String[] args) {
		int[] n= {20,90,90,60,70};
		System.out.println(maxarr1(n,n.length-1));

	}

}
