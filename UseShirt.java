package collection;

import java.util.ArrayList;

public class UseShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shirt s1=new Shirt("Polo",700,"blue",false);
		Shirt s2=new Shirt("DNMX",300,"blue",true);
		Shirt s3=new Shirt("Peter england",1000,"blue",false);
		Shirt s4=new Shirt("Netplay",400,"green",true);
		Shirt s5=new Shirt("Arrow",800,"blue",true);
		Shirt s6=new Shirt("Chinos",200,"blue",false);
		
		ArrayList<Shirt> shirts=new ArrayList<>();
		
		ArrayList<Shirt> checked=new ArrayList<>();
		
		shirts.add(s1);
		shirts.add(s2);
		shirts.add(s3);
		shirts.add(s4);
		shirts.add(s5);
		shirts.add(s6);
		
		for(Shirt sh:shirts)
		{
			if(sh.isIschecked())
			{
				checked.add(sh);
			}
		}

		for(Shirt ch:checked)
		{
			System.out.println(ch);
		}
		
		checked.forEach(ch->System.out.println(ch));
		
		for(int i=0;i<shirts.size();i++)
		{
			if(shirts.get(i).getPrice()%2==0)
			{
				System.out.println(shirts.get(i));
			}
		}
		

	}

}
