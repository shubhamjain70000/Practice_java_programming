package java_programming;

import java.util.LinkedHashSet;

public class CountHowManyTimesDuplicateCharacterIsRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shubham";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+" is repeated "+count+" times ");
			}
		}

	}

}
