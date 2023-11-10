//Given an array where every element occurs three times, except one element which occurs only once.
 //Find the element that occurs once.

//Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} Output: 2
package interfaces;
interface ArrNonRE {
	int findnon(int[] num);
}

public class ArrNonReptaionElement {

	public static void main(String[] args) {
	int[] n= {12,1,12,3,12,1,1,2,3,3};
	ArrNonRE el1=(num)-> {
		int temp=0,count=0;
		
		for(int i=0;i<n.length;i++) 
		{
			count=0;
			for(int j=0;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
				}//i
			}//j
			if(count==3) continue;
			 if(count==1) {
				temp=n[i];
			}//i
			
		}
		 return temp;
	   };
	System.out.println(el1.findnon(n));
	}
}
