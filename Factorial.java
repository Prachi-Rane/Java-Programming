//Program to Find Factorial of a Number
import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int n,fact=1 ;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(n>0)
{
fact=n*fact;
n=n-1;
}
System.out.println("Factorial of Number is "+fact);
}
}