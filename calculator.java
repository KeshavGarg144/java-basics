import java.util.*;
class calculator
{
public static void main(String s[])
{
int a,b,c,add,subt,mult,div;
Scanner sc=new Scanner(System.in);
System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
System.out.print("Enter the value of a= ");
a=sc.nextInt();
System.out.print("Enter the value of b= ");
b=sc.nextInt();
System.out.print("Enter your choice ");
c=sc.nextInt();
switch(c)
{
case 1: add=a+b;
	System.out.print("Sum = "+add);
	break;
case 2: subt=a-b;
	System.out.print("Subtraction = "+subt);
	break;
case 3: mult=a*b;
	System.out.print("Multiplication = "+mult);
	break;
case 4: div=a/b;
	System.out.print("Division = "+div);
	break;
default: System.out.print("Invalid choices");
}
}
}