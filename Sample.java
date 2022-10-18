package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ages=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		ages.add(28);
		ages.add(27);
		ages.add(26);
		ages.add(25);
		ages.add(26);
		ages.add(29);
		ages.add(21);
		//ages.remove(4);
		//ages.set(3, 45);
		ages.remove(Integer.valueOf(26));
		ages.add(2, 45);
		ages.set(5, 100);
		ages.add(500);
		ages.add(1000);
	
		
		for(int i=0;i<ages.size();i++)
		{
			//System.out.println(i);
		  System.out.println(ages.get(i));
			
		}
		System.out.println("___________________________");
		
		for(Integer a:ages)
		{
			System.out.println(a);
		}
		

	}

}
