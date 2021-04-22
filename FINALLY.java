package sem3;

public class FINALLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object ref = null;
		      ref.toString();
		}
		catch(NullPointerException e){
			System.out.println("Exception GENEREATED!!!!!! "+e);
		}
		
		finally {
			System.out.println("YAY! Exception handled");
			
		}
		System.out.println("Im Alive!!! That was a close one!");
	}

}
