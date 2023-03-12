package java_programming;

public class SortArrayElementWithBB {

	public static void main(String[] args) {
		
		int a[]= {8,7,3,2,8,9,4,7,8,2};
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("The maximum element :"+a[a.length-1]);
		System.out.println("The minimum elemenet is : "+a[0]);

	}

}
