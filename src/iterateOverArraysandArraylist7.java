import java.util.ArrayList;

public class iterateOverArraysandArraylist7 {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(500);
        a.add(600);
        a.add(700);
        a.add(800);
        a.add(900);
		
		for (int i =0; i<a.size();i++)
		{
		
		
			 System.out.println(a.get(i)); 
		
	}
		//items present i n ArrayList
		 System.out.println(a.contains(600));
}
}
