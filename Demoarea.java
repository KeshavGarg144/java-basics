import java.util.*;
class Demoarea
{
public static void main(String s[])
{
double area,radius;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the radius= ");
radius=sc.nextInt();
area=3.141*radius*radius;
System.out.print("area= "+area);
}
}