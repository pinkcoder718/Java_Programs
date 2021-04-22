package sem3;

import java.util.Scanner;
abstract class Shape
{
	String Shapename;
	public abstract void area();
	public String toString()
	{
		return this.getClass().getName();
	}
}
class Sphere extends Shape
{	
	double radius;
	public void input(double rad)
	{
		radius=rad;
	}
	public void area()
	{
		System.out.println("Area of "+ toString()+" is:"+ (4*3.142*radius*radius));
	}
}
class Rectangle extends Shape
{
	double length, width;
	public void input(double len, double wid)
	{
		 length=len;
		 width=wid;
	}
	public void area()
	{
		System.out.println("Area of "+ toString()+" is:"+ (length*width));
	}
}
class Triangle extends Shape
{
	double base, height;
	public void input(double b,double h)
	{
		base=b;
		height=h;
	}
	public void area()
	{
		System.out.println("Area of "+ toString()+" is:"+ (0.5*base*height));
	}
}
public class Lab3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double rad=sc.nextDouble();
		Sphere sph=new Sphere();
		sph.input(rad);
		System.out.println(sph.toString());
		sph.area();
		System.out.println("Enter the length of the rectangle");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the rectanagle");
		double width=sc.nextDouble();
		Rectangle rec=new Rectangle();
		rec.input(length, width);
		System.out.println(rec.toString());
		rec.area();
		System.out.println("Enter the base of the triangle");
		double base=sc.nextDouble();
		System.out.println("Enter the height of the triangle");
		double height=sc.nextDouble();
		Triangle tri=new Triangle();
		tri.input(base, height);
		System.out.println(tri.toString());
		tri.area();	
		sc.close();	}
}