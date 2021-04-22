package sem3;

import java.io.*;
public class okay {
 public static void main (String s[]) throws FileNotFoundException, IOException
          {
           File f1 = new File("C:\\Users\\myilv\\OneDrive\\Desktop\\My Files...DO NOT TOUCH without authorization\\hi.txt");  
           File f2 = new File("C:\\Users\\myilv\\OneDrive\\Desktop\\My Files...DO NOT TOUCH without authorization\\hello.txt");
           if(!f1.exists()) // If file is not created then create file
                f1.createNewFile();
           FileInputStream in = new FileInputStream(f1);
           FileOutputStream out= new FileOutputStream(f2);
           int k;
         while ((k=in.read())!=-1){
             System.out.println((char)k);
         }
           int c;
         while ((c = in.read()) != -1) {
            out.write(c);      // writing 
         } 

     in.close();
     out.close();
    }
}
