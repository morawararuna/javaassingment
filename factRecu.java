package recursion;

public class factRecu {
	static int fact(int n) {
		//if(n==5) return 5;
		//if(n==6) return 1;
		if(n==4) return 20;
		else return n*fact(n+1);
	}

	public static void main(String[] args) {
	int n=1;
		System.out.println(fact(n));
		}

}
