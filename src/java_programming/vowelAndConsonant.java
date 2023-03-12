package java_programming;

public class vowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Shubham";
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println(vcount);System.out.println(ccount);

	}

}
