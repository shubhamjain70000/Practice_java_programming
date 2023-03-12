package java_programming;

public class Palindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equals(s)) {
			System.out.println("String is palindrome!!");
		}else {
			System.out.println("String is not palindrome!!");
		}

	}

}
