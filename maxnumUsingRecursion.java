package internentprog;

public class maxnumUsingRecursion {

	public static void main(String[] args) {
		

		int[] arr = {1,3,7,5,10,56,450,9,1};
		// 450
		int max = arr[0];
		System.out.println(findMax(arr,arr.length-1,max));
	}

	private static int findMax(int[] arr, int size, int max) {
		
		if(size == 0) {
			if(arr[size] > max) max = arr[size];
			return max;
		}
		else {
			if(arr[size] > max) max = arr[size];
			return findMax(arr,size-1,max);
		}
		
	}

}


