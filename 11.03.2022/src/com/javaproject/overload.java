package com.javaproject;

public class overload {
	void series(int x,int n)
	{
		double s=0;
		for(int i=1;i<=n;i++) {
			s=s+Math.pow(x, i);
		}System.out.println("sum"+s);
	}
	void series(int p)
	{
		for(int i=1;i<=p;i++)
		{
			int t=0;
			t=(i*i*i)-1;
			System.out.print(t+",");
		}
	}
	void series()
	{
		double s=0;
		for(int i=2;i<=10;i++)
		{
			s=s+((double)1/i);
		}System.out.println("\nSum="+s);
	}

	public static void main(String[] args) {
		overload o=new overload();
		o.series(2,5);
		o.series(5);
		o.series();

	}

}
