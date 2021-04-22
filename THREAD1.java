package sem3;
public class THREAD1 extends Thread{
	public static int hey=1;
	
	public static void main(String []args)
	{
		THREAD1 thread= new THREAD1();
		thread.start();
		
	}
	
	public void run() {
		System.out.println("YAY its working");
	}
}
