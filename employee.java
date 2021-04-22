package sem3;

public class employee {
	
	String name= "Keerthi";
	int age= 18;
	String city= "Bengaluru";
	
	public void display(){
		System.out.println("The name is " +name);
		System.out.println("The age is " +age);
		System.out.println("The city is " +city);
	}
	public static void main(String[] args) {
		employee obj1= new employee();
		employee obj2= new employee();
		obj1.display();
		obj2.display();
	}

}
