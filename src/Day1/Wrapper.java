package Day1;

public class Wrapper {

	public static void main(String[] args) 
	{
		
		//Object to Primitive wrapper class and parsedatatype;
		String s1="100";
		System.out.println(s1+100);		//100100
		
		int num=Integer.parseInt(s1);
		System.out.println(num+100);	//200
		
		String s2="22.34";
		System.out.println(s2+11.11);
	
		double d=Double.parseDouble(s2);
		System.out.println(d+11.11);
		
		String s4="True";
		boolean b=Boolean.parseBoolean(s4);
		System.out.println(b);
		
		
		/*String s3="100ABC";         
		System.out.println(s3+11);
		
		int num1=Integer.parseInt(s3);
			System.out.println(num1+11.11);*/
			
			
			//Primitive to Object Valueof()
			
			int a=22;
			System.out.println(a+22);//44
			String ss1=String.valueOf(a);
			System.out.println(ss1+100);//22100
			
			float f=23.80f;
			System.out.println(11.11+f);//34.90
			String ss2=String.valueOf(f);
			System.out.println(ss2+11.11);
			
			
			int c=100;
			int r=200;
			if(c==r)
			{
			System.out.println(0);
			}
	}

}
