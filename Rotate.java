import java.util.*;
class Rotate
{
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		int rotate[]=new int[arr.length];
		for(int i=arr.length-1,j = 0;i >= 0;i--)
		{
			rotate[j]=arr[i];
			j++;
	
		}
			System.out.println(Arrays.toString(rotate));

	}
}