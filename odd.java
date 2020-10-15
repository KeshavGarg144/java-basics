import java.util.*;
class odd
{
public static void main(String s[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value = ");
a=sc.nextInt();
switch(a%2)
{
case 0:System.out.print("Number is even");
	break;
default :System.out.print("Number is odd");
}
}
}
	