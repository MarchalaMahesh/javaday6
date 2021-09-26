package javaday6;

abstract class Shape
{
	int a=2;
	abstract void draw(int a);
}
class Rectangle extends Shape
{
	public void draw(int a)
	{
		System.out.println("rectangle shape.."+a);
	}
}
public class AbstractDriver {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw(2);
		
	}

}
