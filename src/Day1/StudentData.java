package Day1;

public class StudentData {
	
	int id; String name;
	
	public void Print()
	{
		System.out.println("id is "+id);
		System.out.println("name is"+name);
	}

	public static void main(String[] args) 
	{
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Pranali";
		s1.Print();
		
		
		StudentData s2=new StudentData();
		s1.id=102;
		s1.name="Anusha";
		s1.Print();
		
	}

}
