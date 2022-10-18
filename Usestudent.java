package collection;

import java.util.ArrayList;


public class Usestudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Student s1=new Student("kishore",25000,"male");
	  Student s2=new Student("arul",2500,"female");
	  Student s3=new Student("vignesh",2500,"male");
	  Student s4=new Student("rajaram",2500,"male");
	  Student s5=new Student("saravana",2500,"male");
	  Student s6=new Student("sobha",2500,"female");
	  Student s7=new Student("venket",2500,"male");
	  Student s8=new Student("bharath",5000,"male");
	  Student s9=new Student("naveen",500000,"male");
	  Student s10=new Student("kishore2",255000,"male");
	  
	  
	  ArrayList<Student>students=new ArrayList<>();
	  // add object inside collection
	  students.add(s1);
	  students.add(s2);
	  students.add(s3);
	  students.add(s4);
	  students.add(s5);
	  students.add(s6);
	  students.add(s7);
	  students.add(s8);
	  students.add(s9);
	  students.add(s10);
	  
	  ArrayList<Student>fem=new ArrayList<>();
	 
	  {
		// for eachloop  (lymde = is used to express the value inside it) 
	   // students.forEach(a->System.out.println(a.getname()));
	  }
	  
	   for(Student s:students)
	  {
		   // we can use all string method inside enhanced for loop
		  // System.out.println(s.getname().toLowerCase());
	  }
	  
	  for(int i=0;i<students.size();i++)
	  {
		  // we can use all string method inside foreach loop
		  
		//  System.out.println(students.get(i).getname().toUpperCase());
		//  System.out.println(students.get(i).getgender().toLowerCase());
		  
	  }
	  
	  
	  System.out.println("*****************");
	  students.forEach(a->{
		  if(a.getname().equals("kishore"))
		  {
			 System.out.println(a.getname());
		  }
		  
	  });
	  
	  for(Student s:students)
	  {
		  if(s.getgender().equalsIgnoreCase("female"))
		  {
			  fem.add(s);
		  }
	  }
	  System.out.println("*************");
	  fem.forEach(x->System.out.println(x));
	  
	  System.out.println("********************");
	  
	  for(Student f:fem)
	  {
		  System.out.println(f);
	  }
	  
	  
	
	  
	  
	  
	  
	   
	   
	  
	  
	  

	}

}
