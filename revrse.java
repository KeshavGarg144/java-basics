import java.io.*;
class revrse
{
public static void main(String args[])throws IOException
{
int num,rev=0,r;
BUfferedReader br=new InputStreamReader(System.in()) ;
System.out.print("Enter a number= ");
num=integer.parseInt(br.readLine());
while(num>0)
{
	r=num%10;
	rev=(rev*10)+r;
	num=num/10;
}
System.out.println("Reverse is= "+rev);
}
}
