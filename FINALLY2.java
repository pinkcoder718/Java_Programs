package sem3;

public class FINALLY2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				FINALLY ref = new FINALLY();
			      ref.toString();
			}
			catch(NullPointerException e){
				System.out.println("Exception GENEREATED!!!!!! "+e);
			}
			
			finally {
				System.out.println("YAY! No Exception");
				
			}
			System.out.println("Im Alive!!! That was a close one!");
		}
}
