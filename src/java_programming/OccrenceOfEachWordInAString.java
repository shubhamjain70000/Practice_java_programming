package java_programming;

import java.util.LinkedHashSet;

public class OccrenceOfEachWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Shubham jain and My girlfriend name is Monika das";
		String s1[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		for(String str:set)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(str.equals(s1[i])) {
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Duplicates are: "+str);
			}
		}

	}

}
