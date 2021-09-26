package javaday6;

class A1
{
	int c = 10;
}
class B extends A1
{
	int c=11;
	
}
public class VariableOverShadowing {
	public static void main(String[] args) 
	{
		A1 a1 = new A1();
		//System.out.println(a1.c);
		
		B b = new B();
		//System.out.println(b.c);
		
		A1 a = new B();
		System.out.println(a.c);
		
		B b1 = (B)a;
		//System.out.println(b1.c);
		
		
		
	}

}
