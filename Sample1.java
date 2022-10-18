package collection;

import java.util.ArrayList;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<>();
		
		names.add("kishore");
		names.add("arul");
		names.add("shoba");
		names.add("vignesh");
		names.add("naveen");
		names.add("rajaram");
		names.add("venket");
		names.remove(5);
		names.remove("naveen");
	
		
		for(String n:names)
		{
			//System.out.println(n);
		}
	names.forEach(a->System.out.println(a));

	}

}
