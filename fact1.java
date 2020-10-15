import java.util.*;
class fact1
{
public static void main(String s[])
{
int n,i,f=1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number= ");
n=sc.nextInt();
for(i=n;i>0;i--){
	f=f*i;
}
System.out.print("Factorial is= "+f);

}}