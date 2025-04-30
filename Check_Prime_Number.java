//Program to Check a Number is Prime or Not
import java.util.Scanner;
class prime_no
{
public static void main(String args[])
{
int n,count=0,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(i>0)
{
if(n%i==0)
count=count+1;
i=i+1;
}
if(count==2)
System.out.println("Number is a Prime");
else
System.out.println("Number is not a Prime Number");
}
}