class unique
{
	public static void main(String[] args) {
		int arr[]={1,2,1,5,4,6,7};
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					found = true;
					break;
				}
			}
			if(found)
			{
				break ;
			}
		}
		if(found)
			{
				System.out.println("NOT UNIQUE");
			}
			if(!found)
			{
				System.out.println("UNIQUE");
			}
	}
}