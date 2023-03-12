package java_programming;

import java.util.LinkedHashSet;

public class removeduplicateforString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shubham";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			System.out.print(ch);
		}

	}

}
