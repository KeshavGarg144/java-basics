import java.util.*;

class Nprime
{
int Nprime(int x,int y);
int n,i;
{
for(i=2;i<=n-1;i++)
	{if(n%i==0)
		break;}
	if(i==n) 		
	System.out.print(n+" is a prime number");
	else
	System.out.print(n+" is not a prime number");
return(i);
}
public static void main(String S[])
{
int a,b;
Sample2 s1=new Nprime();
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int p=s1.Nprime(a,b);
System.out.print("p= "+p);
}}