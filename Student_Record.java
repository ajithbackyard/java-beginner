



package encapsulationIntro;

public class Student {

	private int age;
	 String name="Harry";
	
	public void setAge(int age) {
		
		if(age >29) {
			System.out.println("Mr. "+name+", you have exceeded the age limit and cannot be admitted");
		}else this.age =age;

	}
	
	public int getAge() {
		return age;
	}

}
