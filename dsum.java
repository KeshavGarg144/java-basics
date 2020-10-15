import java.util.*;
class dsum
{
public static void main(String s[])
{
int n,i,r,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number= ");
n=sc.nextInt();
while(n>0)
{

r=n%10;
sum=sum+r;
n=n/10;
}
System.out.print("Sum is "+sum);
}}
