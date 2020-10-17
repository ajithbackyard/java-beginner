



//Basic Introductory example code for Method Overloading Concept in JAVA OOPS

class Vehicles{
	
	int rate;
	
	void Volvo(int model) {
		System.out.println("The base price =$ "+(model)+(20));
	}
}

public class MethodOverlaoding {

	public static void main(String[] args) {
		
		Vehicles car=new Vehicles();
		car.Volvo(1945);

	}

}
