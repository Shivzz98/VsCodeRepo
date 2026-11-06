
public class superKeyword_Childdemo12a extends parentdemo12b {

	
	String name = "qaclickacademy";
	
	public superKeyword_Childdemo12a ()
	{
		
		super(); //this should always be in first line after constructor created
		System.out.println("child class constructor");
	}
	
	
	
	
	public void getstringData()
	
	{
		System.out.println(name);
		System.out.println(super.name); //if we run this with this printing statement, both names from parent and child wil be printed beoz of super keyword
	}
	
	public void getData()
	
	{
		super.getData(); // so mehtod in parent will be executed becoz of this keyword
		System.out.println("im in the child classs");
	}
	
	
	public static void main(String[] args) {
		
		
		superKeyword_Childdemo12a cd = new superKeyword_Childdemo12a();
		cd.getstringData();
		cd.getData();
		
		//inthis case if we run, qaclickacademy will be printed ,becoz, it gives preference t0 local variable, but it inherites parentdemo class alsso
		//super keyword actually refers to parent class

	}

}
