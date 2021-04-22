package sem3;


	import Calculator.*;
	import java.util.Scanner;
	public class Lab9 {
	    public static void main(String[] args) 
	    {
	    while(true){
	       System .out.println("1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n"+"5.Exit");
	       System.out.println("Enter the choice");
	       Scanner in= new Scanner(System.in);
	       int n= in.nextInt();
	       if(n==5){
	           System.exit(0);
	       }
	       System.out.println("enter the numbers");
	       int a= in.nextInt();
	       int b= in.nextInt();
	       switch(n){
	           case 1: Add ad= new Add();
	                   int k= ad.add(a,b);
	                   System.out.println(a+"+"+b+"="+k);
	                   break;
	           case 2: Subtract ab= new Subtract();
	                   int l= ab.sub(a, b);
	                   System.out.println(a+"-"+b+"="+l);
	                   break;
	           case 3: Multiply ac= new Multiply();
	                   int m= ac.mul(a, b);
	                   System.out.println(a+"*"+b+"="+m);
	                   break;
	           case 4: Division da= new Division();
	                   int h= da.div(a, b);
	                   System.out.println(a+"/"+b+"="+h);
	                   break;        
	       }
	    }	

	    }
	}

