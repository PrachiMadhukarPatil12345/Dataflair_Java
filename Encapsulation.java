class Student
{
	//public static void main (String args[])
	{
		Encapsulation obj =new Encapsulation();
		obj.setrollno(20);
		System.out.println(obj.getrollno());
	}
}

 public class Encapsulation
 {
	 public static void main (String args[])
	 {
	 private int rollno;
	 
	 public void setrollno(int r)
	 {
		 rollno =r;
	 }
	 public int getrollno()
	 {
		 //System.out.println(rollno);
		 return rollno;
	 }
	 }
 }
 
		