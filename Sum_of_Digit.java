//Program to get the Sum of Digits
import java.util.Scanner;
class sum_of_digit
{
public static void main(String args[])
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(n>0)
{
sum=sum+(n%10);
n=n/10;
}
System.out.println("Sum of Digit is "+sum);
}
}