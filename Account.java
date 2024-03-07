/* class Encapsulation
 {
	 //public static void main (String args[])
	 //{
		 private long rollno;
		 public long getRollno()
		 {
			 return rollno;
		 //System.out.println(rollno);
	     }
		  public void setRollno(long r)
		 {
			 this.rollno =r;
		 }
	 //}
 }
 
public class Student
{
	public static void main (String args[])
	{
		Encapsulation obj1 =new Encapsulation();
		obj1.setRollno(20);
		System.out.println(obj1.getrollno());
	}
}*/
 
 class Account {  
	//private data members  
	private long acc_no;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	public long getAcc_no() {  
	    return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
	    this.acc_no = acc_no;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public float getAmount() {  
	    return amount;  
	}  
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
	  
	}  


 
		