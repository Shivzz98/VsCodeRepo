
//Constructors in Java
//	A constructor is a special method that is used to initialize an object.Every class has a constructor,if we don't explicitly declare a constructor for any java class the compiler builds a default constructor for that class. A constructor does not have any return type.

//A constructor has same name as the class in which it resides. Constructor in Java can not be abstract, static, final or synchronized. These modifiers are not allowed for constructor.


public class constructorIntro11 {
	
	
	//constructor syntax, no return type, it is also a default constructor
	
	public constructorIntro11() 
	
	{
		System.out.println("im the constructor");
		
	}
	
	//parameterized Constructor
	
	

	public constructorIntro11(int a , int b) 
	
	{
		System.out.println("im the parameterized constructor");
		
	}
	public constructorIntro11(String str) 
	
	{
		System.out.println(str);
		
	}
	
	
	//method, has return type-void
	
	public void getData()
	
	{
		System.out.println("im the method");
	}
	
	
	
	public static void main(String[] args) {
		
		constructorIntro11 ci = new constructorIntro11 ();
		// whenever u create object, constructor is called, no need to call method, just printit, "im the constructor will be pritnted"

		constructorIntro11 paraci = new constructorIntro11 (4,5);
		constructorIntro11 paracistr1 = new constructorIntro11 ("hello siva");
	
	}
}