package recursion;

public class table {
	 public static void multi(int n,int k) {
		if(k==10) {
			System.out.println(n*k++);
		}else {
			System.out.println(n*k++);
			multi(n,k);
		}
		}
 public static void main(String[] args) {
		int n=6;
		int k=1;
		multi(n,k);

	}
	}
