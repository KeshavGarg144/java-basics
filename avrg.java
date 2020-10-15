import java.util.*;
class avrg
{
public static void main(String s[])
{
double num1,num2,num3,num4,num5,totalmarks,avrg;
Scanner sc=new Scanner(System.in);
System.out.print("Enter first marks= ");
num1=sc.nextInt();
System.out.print("Enter second marks= ");
num2=sc.nextInt();
System.out.print("Enter third marks= ");
num3=sc.nextInt();
System.out.print("Enter fourth marks= ");
num4=sc.nextInt();
System.out.print("Enter fifth marks= ");
num5=sc.nextInt();
totalmarks=num1+num2+num3+num4+num5;
System.out.println("Average marks is "+totalmarks);
avrg=totalmarks/5;
System.out.println("Average marks is "+avrg);
if(avrg>90)
	{
	System.out.print("Grade is A");
	}
else if(avrg>80)
	{
	System.out.print("Grade is B");
	}
else if(avrg>70)
	{
	System.out.print("Grade is C");
	}
else if(avrg>45)
	{
	System.out.print("Grade is D");
	}
else if(avrg<45)
	{
	System.out.print("Student is fail");
	}

}
}