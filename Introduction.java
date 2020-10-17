

//Introductory program , Basic concepts of Object Oriented programming in JAVA



package javaDev;

class Dogs{
	int numberOfLegs;
	String Breed;
	String name;
	
	  void  Method(int numberOfLegs,String Breed) {
		this.numberOfLegs=numberOfLegs;
		this.Breed=Breed;
		
		System.out.println("The breed of my dog "+name+" is "+Breed+" and has number of legs="+numberOfLegs);
		
	}
}


public class OOPsIntro {

	public static void main(String[] args) {
		int legs=4;
		Dogs obj=new Dogs();
		obj.name="Jimmy";
		obj.Method(legs,"Husky");
		
		int result =Methododlogy();
		
		
	

	}
	static int Methododlogy() {
		int exit=-1;
		return exit;
		
	}

}
