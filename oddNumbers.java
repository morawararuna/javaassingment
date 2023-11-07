package recursion;

public class oddNumbers {

	public static void main(String[] args) {
		int i=10;
		System.out.println(sumrec(i));

	}

	private static int sumrec(int i) {
	if(i==1) return 1;
	else {
		if(i%2==0) return sumrec(i-1);
		else return i+sumrec(i-1);
	}
	
	}

}
