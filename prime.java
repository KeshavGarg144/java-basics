import java.util.*;
class prime
{
public static void main(String s[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
n=sc.nextInt();
for(i=2;i<=n-1;i++)
	if(n%i==0)
		break;
	if(i==n) 		
	System.out.print(n+" is a prime number");
	else
	System.out.print(n+" is not a prime number");
}
}