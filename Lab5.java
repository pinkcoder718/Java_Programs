package sem3;

import java.util.*;

class LessBalanceException extends Exception 
{


	LessBalanceException(String s)   
    {
        super(s);    
    }
}

class acc      
{
     double min;
     acc()
     {
         min=1000;       
     }
     void deposit(double amt)
     {
         min=min+amt;   
     }
     void withdraw(double amt)
     {
         double t;
         t=min;
         t=t-amt;
         try {
             if (t < 1000)  
                 throw new LessBalanceException("Balance can't go less then 1000 (Withdraw amount is not valid)");
             else {
                 min = min - amt;   
                 System.out.print("Balance after withdraw:");
                 System.out.println(min);
             }
         }
         catch(LessBalanceException l)
         {
             System.out.println(l.getMessage());
         }
     }
     

double balance()
     {
         return min;
     }
}
public class Lab5 {
    public static void main(String args[])       {
        acc a=new acc();   
        acc b=new acc();   
        double dep,wit;
        Scanner sc=new Scanner(System.in);
        System.out.print("Min bal of account1: ");
        System.out.println(a.balance());     
        System.out.println("Enter the amount to deposit: ");
        dep = sc.nextDouble();
        a.deposit(dep);         
        System.out.print("Balance after deposit:");
        System.out.println(a.balance());
        System.out.println("Enter the amount to Withdraw: ");
        wit = sc.nextDouble();
        a.withdraw(wit);      
        System.out.print("\nMin bal of account2: ");
        System.out.println(b.balance());    
        System.out.println("Enter the amount to deposit: ");
        dep = sc.nextDouble();
        b.deposit(dep);         
        System.out.print("Balance after deposit:");
        System.out.println(b.balance());
        System.out.println("Enter the amount to Withdraw: ");
        wit = sc.nextDouble();
        b.withdraw(wit);    
        sc.close();
    }                     
 }


