
public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		//Check if any array's multiply by 2
		for(int i=0; i>arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i]+" is not multiplyed by 2.");
			}
		}

	}

}
