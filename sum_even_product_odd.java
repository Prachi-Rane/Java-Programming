// Program to Find Sum of Even & Product of Odd Digits of a Number

import java.util.Scanner;
class sum_even_odd_pro
{
public static void main(String args[])
{
int n,sum=0,product=1,digit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(n>0)
{
digit=n%10;
if(digit%2==0)
sum=sum+digit;
else
product=product*digit;
n=n/10;
}
System.out.println("Sum of Even Numbers are "+sum);
System.out.println("Product of Odd Numbers are "+product);
}
}
