package javaday6;

interface Rbi
{
	abstract int rateOfInterest();
}
class Sbi implements Rbi
{
	public int rateOfInterest()
	{
		return 2;
	}
}

class Hdfc implements Rbi
{
	public int rateOfInterest()
	{
		return 3;
	}
}

public class BankDriver {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println("interest of sbi is :"+s.rateOfInterest());
		
		Hdfc h = new Hdfc();
		System.out.println("interest of hdfc is :"+h.rateOfInterest());
	}

}
