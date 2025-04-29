//Palindrome Number Program

import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int n,reverse=0,original;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
original=n;
while(n>0)
{
reverse=reverse*10+(n%10);
n=n/10;
}
if(original==reverse)
System.out.println("Number is Palindrome");
else
System.out.println("Number is not a Palindrome");
}
}