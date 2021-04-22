package sem3;

public class Out {
		int i,j;
		Out(int i, int j)
		{
			this.i=i;
			this.j=j;
		}
		//inner class
	protected class A
	{
		long display(int k)
		{
		  	return i*j*k;
		}
	}
	}
	class mymain
	{
		public static void main(String[] args)
		{
			Out out=new Out(5,8);
			Out.A in=out.new A();
			System.out.println("THE OUTPUT FOR THIS PROGRAM IS "+in.display(3));
		}
	}

