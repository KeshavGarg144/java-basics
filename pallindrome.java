import java.util.*;
class pallindrome
{
public static void main(String s[])
{
int num,rev=0,r,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
num=sc.nextInt();
a=num;
while(num>0)
{
	r=num%10;
	rev=(rev*10)+r;
	num=num/10;
}
//System.out.print("Revrse is= "+rev);

if(rev==a){
System.out.print("Number is pallindrome");
}
else
System.out.print("Number is not pallindrome");
}
}
