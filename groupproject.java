package sem3;

import java.util.Scanner;
import java.util.Arrays; 
class USN_19BTRCR006 
{
	double mean;
	double sum=0;
	public void mean(int arr[],int num)
	{
		for(int i=0;i<num;i++)
		{
			sum=sum+arr[i];	// a is the array here 
		}
		mean=sum/num;
	System.out.println("The mean of the given data is:"+ mean);
	}
}
class USN_19BTRCR016
{ 
	static void mode(int a[],int n) 
	{
		int maxValue = 0, maxCount = 0, i, j;
		for (i = 0; i < n; ++i) 
		{
			int count = 0;
		    for (j = i+1; j < n; ++j) 
		    {
		    	if (a[j] == a[i])
		    	{
		            ++count;
		        }
		    }
		    if (count > maxCount) 
		    {
		    	maxCount = count;
		        maxValue = a[i];
		    }
		 }
		      System.out.println("The Mode of the given data is:"+maxValue); 
	}
}
class USN_19BTRCR007
{
	public void Median(int a[],int n)
	{
       double median; 
       System.out.print("The Median of the given data is:");
       Arrays.sort(a);
       if(n%2==0)
       {
    	   median=a[(n-1)/2]+a[(n)/2];
    	   median/=2;
       } 
       else
       {
          median=a[(n)/2];
       }        
       System.out.println(median);
     }
}
public class groupproject 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			 arr[i]=sc.nextInt();
		}
		USN_19BTRCR006 obj=new USN_19BTRCR006();
		obj.mean(arr,num);
		USN_19BTRCR007 obj2=new USN_19BTRCR007(); 
		obj2.Median(arr,num);    
		USN_19BTRCR016.mode(arr, num);
		sc.close();
	}
}
