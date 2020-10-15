import java.util.*;
class codd
{
public static void main(String s[])
{
int n,e=0,o=0,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number= ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	if(i%2==0){
	e++;}
	else
	o++;
}
System.out.println("Number of even is "+e);
System.out.print("Number of odd is "+o);
		
}
}