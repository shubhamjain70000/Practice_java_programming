package java_programming;

public class reverseAString {

	public static void main(String[] args) {
		String s="My name is shubham jain";
		String s1[]=s.split(" ");
		String reverse="";
		for(int i=s1.length-1;i>=0;i--)
		{
			reverse=reverse+s1[i]+" ";
		}
		System.out.println(reverse);
		}

}
