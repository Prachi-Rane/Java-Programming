//Table of a given Number
import java.util.Scanner;
class table
{
public static void main(String args[])
{
int n,i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(n+" * "+i+" = "+n*i);
}
}
}