package com.javaproject;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobno;
	double cost,dis,amount;
	public ShowRoom()
	{
		name="";
		mobno=0L;

	}
	void intput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the mobno");
		mobno=sc.nextLong();
		System.out.println("enter the cost");
		cost=sc.nextDouble();
	}
	void calculate()
	{
		if(cost<10000)
		{
			dis=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000)
		{
			dis=(cost*10)/100;
		}
		else if(cost>20000 && cost<=35000)
		{
			dis=(cost*15)/100;
		}
		else
		{
			dis=(cost*20)/100;
		}
	}
	void display()
	{
		amount=cost-dis;
		System.out.println("Customer Name="+name);
		System.out.println("Customer mobno"+mobno);

		System.out.println(" amount"+amount);


	}

	public static void main(String[] args) {
		ShowRoom s=new ShowRoom();
		s.intput();
		s.calculate();
		s.display();
	}

}
