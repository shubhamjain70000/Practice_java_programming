package java_programming;

public class reverseEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="shubham jain";
		String s1[]=s.split(" ");
		for(int i=0;i<s.length();i++)
		{
			String str=s1[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
