package interfaces;
interface Evenodd1{
	  
	  boolean isEven(int num);
	  
}

public class EvenOdd {
	public static void main(String[] args) {
		Evenodd1 eOdd = 	 (num)->{
			 if(num % 2 == 0) return true;
			 else return false;
		 };
		 
		 boolean res = eOdd.isEven(25);
		 
		 System.out.println(res);
	}

//functional interface
	

	}


