package java_programming;

public class swapLast2word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is shubham jain";
		String s1[]=s.split(" ");
		String ft=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=ft;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	
		

	}

}
