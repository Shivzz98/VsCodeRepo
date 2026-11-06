
public class thisKeyword13 {

	
	int a = 2;
	
	public void getData()
	
	{
		int a=3;
		int b = a + this.a; //summing local + global variable
		
		System.out.println(a); // prints 3
		System.out.println(this.a); //prints 2
		//this refers to current object, object scope lies in class level
		System.out.println(b); 
	}
	
	
	public static void main(String[] args) {
		thisKeyword13 a1 = new thisKeyword13();
		a1.getData();
		
		
	}
}
