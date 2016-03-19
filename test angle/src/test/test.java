package test;

import java.util.Scanner;

public class test {

	
	public static void main(String args[])
	{
		read();
		testAngle(a,b,c);
	}
	
	private static int a;
	private static int b;
	private static int c;
	
	public static void read()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("输入3边！"); 
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
	}
	
	public static int testAngle(int a,int b,int c)
	{
		int a1=a,b1=b,c1=c;
		if(a1>b1)
		{
			if(a1>c1)
			{
				c=a1;
				a=b1;
				b=c1;	
			}
			else
			{
				c=c1;
				a=b1;
				b=a1;
			}
		}
		else
		{
			if(b1>c1)
			{
				c=b1;
				a=a1;
				b=c1;
			}
			else
			{
				c=c1;
				a=b1;
				b=a1;
			}
		}
		
		
		if(a+b<=c)
		{
			System.out.println("这不是个三角形");
			return -1;
		}
		else
		{
			double aa=Math.pow(a,2);
			double bb=Math.pow(b,2);
			double cc=Math.pow(c, 2);
			
			if(aa+bb>cc)
			{
				System.out.println("这是一个锐角三角形");
				return 0;
			}
			else if(aa+bb==cc)
			{
				System.out.println("这是一个直角三角形");
				return 1;
			}
			else if(aa+bb<cc)
			{
				System.out.println("这是一个钝角三角形");
				return 2;
			}
		}
		return 0;
	}
}
