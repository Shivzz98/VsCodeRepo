
public class objectconceptIntro9 {

	public static void main(String[] args) {
	
		
		
//object1		

		objectconceptIntro9 d = new objectconceptIntro9();  //objectcreation
		 d.getData(); //calling methods present inside that class
	
		 
//object 2
		 
		objectconceptIntro9 d1 = new objectconceptIntro9();  //objectcreation
	    String name =d.getData1();
	    System.out.println(name);
	    
//object3 , method is in another class
	    
	    objectintro9b d2 = new objectintro9b(); //another class name
	    d2.getuserData();
	    
	    
	    
	}
	
	public void getData()   //creating methods for re-usability
	
	{
		System.out.println("hello world");  

}
public String getData1()   //creating methods for re-usability with retrun type
	
	{
		System.out.println("hello world");  
		return "rahulshetty";

}	
	
}