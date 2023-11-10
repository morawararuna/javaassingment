package internentprog;

public class LargestSumOfContiguous {

	public static void main(String[] args) {
		int[] arr= {10,20,-3,5,0,1,-11,55,77};
	    int botSize =arr.length;
		int maxSum = 0;
		int eachSubArrMax =0;
		
		for(int top=0;top<arr.length;top++) {
			botSize =arr.length;
			while(botSize != top) {
				System.out.println("");
				eachSubArrMax =0;
				for(int bot=top;bot<botSize;bot++) {
					eachSubArrMax = eachSubArrMax+arr[bot];
					System.out.print(arr[bot]+",");
				}// for
				if(eachSubArrMax > maxSum) {
					maxSum = eachSubArrMax;
				}// if
				System.out.print("....Max value--->"+maxSum);
				botSize--;
			}// while
				
		}// for
		
		System.out.println("Max Value----->"+maxSum);
		
		
	}
}