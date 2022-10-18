package collection;

public class Student {
	
	private String name;
	private int fees;
	private String gender;
	
	public Student(String name,int fees,String gender) {

		this.name =name;
		this.fees =fees;
		this.gender =gender;
	}
	
	public void setname(String name)
	{
	  this.name=name;	
	}
	public String getname()
	{
		return name;
	}
	public void setfee(int fees) 
	{
	  this.fees=fees;	
	}
	public int getfee()
	{
	  return fees;	
	}
	public void setgender(String gender)
	{
	  this.gender=gender;	
	}
	public String getgender()
	{
	  return gender;	
	}
	
	public String toString() 
	{
	  return "Name = "+name+" "+"Fees = "+fees+" "+"Gender = "+gender;	
	}
	

}
