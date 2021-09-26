package javaday6;

abstract class Test1
{
	abstract void demo();
	
}
class Test2 extends Test1
{
	void demo()
	{
		System.out.println("abstract");
	}
}
public class Absract {
	public static void main(String[] args) {
		Test1 t = new Test2();
		t.demo();
	}
}


