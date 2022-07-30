package Week3.day1;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students data=new Students();
		data.getstudentinfo(20);
		data.getstudentinfo(30,"dhi");
		data.getstudentinfo("cute@yahoo.com","775678898999");
	}




public void getstudentinfo(int id)
{
	System.out.println("student id"+id);
}
public void getstudentinfo(int id,String name)
{
	System.out.println("student id"+id+"Name"+name);
}
public void getstudentinfo(String Email,String Phonenumber)
{
	System.out.println("Email"+Email+"phone"+Phonenumber);
}
}