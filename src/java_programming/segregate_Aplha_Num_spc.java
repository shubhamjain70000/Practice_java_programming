package java_programming;

public class segregate_Aplha_Num_spc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="nsndkj73467236*&^&(&";
		String alph="";
		String num="";
		String spc="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				alph=alph+s.charAt(i);
			}else if(ch>='1'&& ch<='9')
			{
				num=num+s.charAt(i);
			}else {
				spc=spc+s.charAt(i);
			}
		}
		System.out.println(alph+" "+num+" "+spc);

	}

}
