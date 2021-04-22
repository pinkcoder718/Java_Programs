package sem3;

public class FINALLY3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Object ref = null;
			      ref.toString();
			}
			catch(ArithmeticException e){
				System.out.println("Exception GENEREATED!!!!!! "+e);
			}
			
			finally {
				System.out.println("NOOOOO! Exception not handled");
				
			}
			System.out.println("Im Alive!!! That was a close one!");
		}

}

