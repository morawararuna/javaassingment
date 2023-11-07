package recursion;

public class sumdigits {
    static int sum(int n)
    {
    	if(n==5)return 5;
    	else return n+sum(n+1);
    	
    }
	public static void main(String[] args) {
		int n=1;
System.out.println(sum(n));
	}

}
