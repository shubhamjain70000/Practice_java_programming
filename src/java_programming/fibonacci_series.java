package java_programming;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ft=0;
		int st=1;
		int nt;
		for(int i=0;i<10;i++)
		{
			System.out.print(ft+" ");
			nt=ft+st;
			ft=st;
			st=nt;
		}

	}

}
