package com.javaproject;

import java.util.Scanner;

public class BookFair {
	String Bname;
	double price,dis,amount;
public  BookFair()
{
	Bname="";
	price=0.0;
}
void input()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Book Name");
	Bname=sc.nextLine();
	System.out.println("Enter the Price");
	price=sc.nextDouble();
	
}
void calculate()
{
	if(price<=1000)
	{
		dis=(price*2)/100;
	}
	else if(price>=1000 && price<=3000)
	{
		dis=(price*10)/100;
	}
	else if(price>=3000)
	{
		dis=(price*15)/100;
	}
}
void dispay()
{
	amount=price-dis;
	System.out.println("Book Name"+Bname);
	System.out.println("Book Price"+price);
	System.out.println("amount"+amount);
}
	public static void main(String[] args) {
		BookFair Book=new BookFair();
		Book.input();
		Book.calculate();
		Book.dispay();

	}

}
