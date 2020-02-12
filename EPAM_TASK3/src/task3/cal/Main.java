package task3.cal;

import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	float res=0,op1=0,op2=0;
	String op;
	Scanner sc=new Scanner(System.in);
	//Taking inputs
	System.out.println("Enter operand 1:");
	op1=sc.nextFloat();
	System.out.println("Enter operand 2:");
	op2=sc.nextFloat();
	System.out.println("Enter the operator:");
	sc.nextLine();
	op=sc.nextLine();
	//Calling the driver layer and passing data
	Driver d=new Driver();
	try
	{
		res=d.calculate(op1,op2,op);
		System.out.println("Result:"+res);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	sc.close();
}
}
