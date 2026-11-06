
public class Strings8 {

	public static void main(String[] args) {
		
		//strings is an object that represents sequence of characters
		
		
		//String literal
		String s = "Siva";
		String s1 = "Siva";
		//with same string value, how many variable we create, it will create only one memory
		
		
		//new memory operator, if it has same value ,it will create different memory
		String s2 = new String ("welcome");
		String s3 = new String ("welcome");

		String s4 = "Siva Sankar Visakai";
		String[] splittedstring = s4.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
	System.out.println(splittedstring[2]);
	
	System.out.println("------------------------------");
	
	
	String s5 = "Siva Sankar Visakai";
	String[] splittedstring1 = s5.split("Sankar");
	System.out.println(splittedstring1[0]);
	System.out.println(splittedstring1[1].trim()); //trim extra blank spaces

	
	for( int i =0; i<s5.length(); i++) //printing particular char value using index
	{
		System.out.println(s5.charAt(i));
	}
	

	for( int i=s5.length()-1; i>=0; i--) //printing particular char value in reverse order using index
	{
		System.out.println(s5.charAt(i));
	}
	
	
}
	
	
	
	
}
