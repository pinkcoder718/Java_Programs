package sem3;


//Program to perform Multilevel inheritence in JAVA
//Jaydeep, Myil Vaughanan V L, Pranav AM, Alvin James 
class X
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}
class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
class Inheritence_Multilevel extends Y
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Inheritence_Multilevel obj = new Inheritence_Multilevel();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}