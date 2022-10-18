package collection;

import java.util.ArrayList;

public class UseSpecs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Specs s1=new Specs(1000, "chennai", false);
		Specs s2=new Specs(2000, "polur", true);
		Specs s3=new Specs(3000, "chjgdu", true);
		Specs s4=new Specs(1500, "pondy", true);
		Specs s5=new Specs(1700, "thiruvanamalai", false);
		Specs s6=new Specs(1100, "chennai", true);
		
		ArrayList<Specs>sp=new ArrayList<>();
		ArrayList<Specs>n=new ArrayList<>();
		ArrayList<Specs>news=new ArrayList<>();
		
		sp.add(s1);
		sp.add(s2);
		sp.add(s3);
		sp.add(s4);
		sp.add(s5);
		sp.add(s6);
		
		/*for(Specs s:sp)
		{
			if(s.getLocation().equalsIgnoreCase("chennai"))
			{
				n.add(s);
			}
		}
		n.forEach(x->System.out.println(x));
		System.out.println("*************************");
		for(Specs nw:n)
		{
			System.out.println(nw);
		}
		
		System.out.println("************************");
		
		for(Specs s:sp)
		{
			if(s.getLocation().length()>10)
			{
				news.add(s);
			}
		}
		news.forEach(a->System.out.println(a));
		*/
		
		
	System.out.println("*************");
	
	for(int i=0;i<sp.size();i++){
		
	//if(sp.get(i).getLocation().charAt(i)) {
		
	}
	
		

	}

}
