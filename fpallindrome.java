import java.util.*;
class fpallindrome
{
public static void main(String s[])
{
int num,rev=0,r,a,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
num=sc.nextInt();
a=num;
for(i=num;i>0;i=i/10)
{
	r=i%10;
	rev=(rev*10)+r;
	
}
//System.out.print("Revrse is= "+rev);

if(rev==a){
System.out.print("Number is pallindrome");
}
else
System.out.print("Number is not pallindrome");
}
}
