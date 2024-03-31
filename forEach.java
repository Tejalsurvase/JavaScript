import java.util.* ;
class demo
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9} ;
		for (int i : arr)
		{
			System.out.println(i + " ") ;
		}
		System.out.println() ;
		List<String> list = Arrays.asList("Tejal", "Kajal","Sejal","Komal") ;
		System.out.println(list) ;
		list.forEach((ele)->Sys.out.println(ele)) ;
		for(String str : list)
		{
			System.out.println(str) ;
		}
	}
}