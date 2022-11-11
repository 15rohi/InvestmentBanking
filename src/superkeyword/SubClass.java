package superkeyword;

public class SubClass extends Superclass{
	int a=40;
	
	public void method1()
	{
		super.method1();
		System.out.println("superclass variable"+super.a);
		
		
	}
	
	
	SubClass()
	{
		System.out.println("SUBClass COnstructor");
	}
	public static void main(String[] args) {
		SubClass x =new SubClass();
		x.method1();
		
		
	}

}