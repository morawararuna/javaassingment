
public class ArrayDuplicationNtimes {

	public static void main(String[] args) {
		int n[]= {10,50,90,90,80,80,80,68,78};
		System.out.println("Before Removing Duplicates.....");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
         //after removing duplications
		//10,50,90,80,68,78
		int size = n.length;
			for(int i=0;i<size;i++) {
				
				for(int j=i+1;j<size;j++) {
					
					if(n[i] == n[j]) {
						for(int k=j;k<size-1;k++) {
							n[k] = n[k+1];
						}// k
						size = size-1;
						j--;
					}// if
				}// j
			}// i
			System.out.println("\n After Removing Duplicates.....\n");
			for(int i=0;i<size;i++) {
				System.out.print(n[i]+" ");
			}
		
		}

	
	}


