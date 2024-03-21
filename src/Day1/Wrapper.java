package Day1;

public class Wrapper {

	public static void main(String[] args) 
	{
		String s1="100";
		System.out.println(s1+100);		//100100
		
		int num=Integer.parseInt(s1);
		System.out.println(num+100);	//200
	}

}
