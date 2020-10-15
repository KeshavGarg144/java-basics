import java.util.*;
class salary
{
public static void main(String s[])
{
double salary,hike;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the salary= ");
salary=sc.nextInt();
if(salary>15000)
{
	hike=(salary*15)/100;
	hike=hike+salary;
	System.out.print("Hiked salary is "+hike);
}
else
{
System.out.print("Salary is "+salary);
}
}
}
