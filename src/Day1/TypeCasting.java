package Day1;

public class TypeCasting {

	public static void main(String[] args)
	{/*Primitive to Primitive
	/*1: iMPLICIT
	 * byte--char--short--int--long--float--double
	 *
	 * 2;explicit
	 */
		int x=90;
		long l=x;
		System.out.println(l);			//90
		//int y=l;						Tye mismatch
		
		char a='B';
		int y=a;
		System.out.println(y);			//66(Ascii value for B)
		
		int z=7898;
		float f1=z;
		System.out.println(f1);			//7898.0
		
		long l2=76894023L;
		float f2=l2;
		System.out.println(f2); 		// 7.6894024E7
		
		double d1=983758023;
		float f6=(float) d1;
		System.out.println(f6); 		

		

	}

}
