package sem3;

public class Pro {

	public static void main(String[] args) {
		Pro Mac= new Pro(); //Mac object created 
		int i=5,j=15;
		Mac.iPad();
		Mac.iPad(i);
		Mac.iPad(i,j);

	}
	
	void iPad() {//non static method1 with no arguments
		System.out.println("Hi!");
	}
	
	void iPad(int a) {//non static method2 with one argument
		System.out.println("Hi! Hi!");
	}
	
	void iPad(int a,int b) {//non static method3 with two argument
		System.out.println("Hi! Hi! Hi!");
	}

}
