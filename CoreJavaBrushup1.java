
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		
		int Mynum=5;
		String website = "www.udemy.com";
		char letter = 'g';
		double dec = 5.99;
		boolean mycard = true;
		
		System.out.println(Mynum+" is the value stored in Mynum value");
		System.out.println(website+" is the value stored in website value");
		System.out.println(letter+" is the value stored in letter");
		System.out.println(dec+" is the value stored in decimal value");
		System.out.println(mycard+" is the value stored in boolean value");
		
		//Array;
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(arr[3]);
		
		//For loop
		for(int i=0; i<arr.length; i++)  
		{
			System.out.println(arr[i]);
		}
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		

	}

}
