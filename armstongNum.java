
public class armstongNum {

	public static void main(String[] args) {
		int num=153,t,r,sum=0;
	t=num;
	
		while(num!=0) {
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
			}
		num=t;
		if(sum==num) {
		System.out.println(true);
		}
		else {
			System.out.println(false);
		}}}
				
	


