// Program to Find Product of Digits
import java.util.Scanner;
class product_no
{
public static void main(String args[])
{
int n,product=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(n>0)
{
product=product*(n%10);
n=n/10;
}
System.out.println("Product of Numbers are "+product);
}
}