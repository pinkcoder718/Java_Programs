package sem3;

import java.util.*;
class Cases {
    String s="Jain University";   
    StringBuffer a=new StringBuffer();    
    StringBuffer b=new StringBuffer("SETJU"); 
    StringBuffer c=new StringBuffer(50); 
    void demo1()
    {
        System.out.println("Case1");
        System.out.println("With input, string length is: "+s.length()); 
        System.out.println("Before input, stringbuffer length is: "+a.length());  
        System.out.println("With input, stringbuffer length is: "+b.length());
        System.out.println("With capacity input, stringbuffer length is: "+c.length());
        System.out.println("Before input, stringbuffer length is: "+a.capacity());   
        System.out.println("With input, stringbuffer length is: "+b.capacity());
        System.out.println("With capacity input, stringbuffer length is: "+c.capacity());
    }
    String demo2(String read) {
        String reverse = "";
        int i=read.length()-1;
        while(i>=0) 
        {
            reverse = reverse + read.charAt(i--);
        }
        return reverse;
    }  
    String demo3(String read1, String read2) {
        return read1.concat(read2);
    }
    
    void demo4(String read)
    {
        System.out.println("\nCase4");
        System.out.println("Given only begining index as 2: "+read.substring(2));
        System.out.println("Given begining and end index as (2 to 4) "+read.substring(2,4));
    }
}
public class Lab4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        Cases c1=new Cases();
        c1.demo1();
        
        System.out.println("\nCase2");
        System.out.println("Enter string to  reverse: ");
        String s1=sc.nextLine();
        String res1=c1.demo2(s1);
        System.out.println("Reversed string is "+res1);
        
        System.out.println("\nCase3");
        System.out.println("Enter string to append: ");
        String s2=sc.nextLine();
        String res2=c1.demo3(res1,s2);
        System.out.println("Concatenated string is "+res2);
        
        c1.demo4(res2);
        sc.close();
    }
}