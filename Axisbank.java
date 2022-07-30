package Week3.day1;

public class Axisbank extends Bankinfo{

	public void deposit()
	{
	System.out.println("THERE IS INCRESA IN THE RATE OF INTEREST");
	}
	public static void main (String args[]) {
		Axisbank d1=new Axisbank();
				d1.deposit();
				d1.fixed();
				d1.saving();
	}
}
