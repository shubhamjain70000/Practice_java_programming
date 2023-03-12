package java_programming;

public class CountUpperAndLower {

	public static void main(String[] args) {
		
		String s="Shubham";
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println(vcount+" "+ccount);

	}

}
