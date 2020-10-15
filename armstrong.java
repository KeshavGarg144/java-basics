import java.util.*;
class armstrong
{
public static void main(String s[])
{
int num,arm=0,a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
num=sc.nextInt();
b=num;
while(num>0)
{
	a=num%10;
	arm=arm+(a*a*a);
	num=num/10;
}
if(b==arm){
System.out.print("Number is armstrong number");
}
else
System.out.print("Number is not a armstrong number");
}
}	