//Program to Check a Number is odd or even
import java.util.Scanner;
class even_odd
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
a=sc.nextInt();
if(a%2==0)
System.out.println("Number "+a+" is Even.");
else
System.out.println("Number "+a+" is Odd");
}
}