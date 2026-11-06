
public class ownStaticmethodswithoutobject10 {

	public static void main(String[] args) {
		

		System.out.println(getuserData()); //no need of object, becoz of static keyword
		
	}
	
	
	
public  static String getuserData()   //creating methods for re-usability with static , so it belongs to class not object
	
	{
		System.out.println("hello meow");  
		return "rahulshetty";
}

}
