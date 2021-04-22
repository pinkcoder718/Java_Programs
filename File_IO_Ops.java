package sem3;

import java.io.*;

	public class File_IO_Ops {

	public static void main (String s[]) throws FileNotFoundException, IOException
	          {
	           File f1 = new File("C:\\Users\\myilv\\OneDrive\\Desktop\\My Files...DO NOT TOUCH without authorization\\JAVA works\\src\\sem3\\input.txt");  
	           File f2 = new File("C:\\Users\\myilv\\OneDrive\\Desktop\\My Files...DO NOT TOUCH without authorization\\JAVA works\\src\\sem3\\output.txt");
	           if(!f1.exists()) // If file is not created then create file
	                f1.createNewFile();
	           FileReader in;
	           FileWriter out;
	           PrintWriter out1;
	    
	           try {
	           in = new FileReader(f1);
	           out = new FileWriter(f2);
	           out1= new PrintWriter(out);

	           int k;
	         while ((k=in.read())!=-1){
	             System.out.print((char)k); //Reading Input 
	             out1.print((char)k); //Writing in new file
	         }
	           out1.close();
	         
	           
	           File f= new File("data.txt");
	         if(f.createNewFile()){ //Creating new file called data.txt
	             System.out.println("File created");
	         	}
	         	boolean de= f.delete();  // File deletion
	         	System.out.println("File deleted="+de);
	           	}
	           	catch (Exception e){
	        	   System.out.println("Error");
	           }
	    }
	}
	          /* finally {
	        	   
	        		   in.close();
	        		   in2.close();
	        		   out.close();
	        		   }
	          }
	}*/
