package javaday6;

class Sheela
{
	// over riden mathod
	void demo()
	{
		System.out.println("sheela");
	}
	
}
class Laila extends Sheela
{
	// over riding method
	void demo()
	{
		System.out.println("laila");
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {
			Laila l = new Laila();
			l.demo();
			
			Sheela s = new Sheela();
			s.demo();
			
		  Sheela s1 = new Laila();
		  s1.demo();
	}

}
