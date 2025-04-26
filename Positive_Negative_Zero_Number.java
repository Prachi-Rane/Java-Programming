//Program to check positive/Negative/Zero
import java.util.Scanner;
class pos_neg
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a NUmber: ");
a=sc.nextInt();
if(a>0)
{
System.out.println("Number is Postive");
}
else if(a<0)
System.out.println("Number is Negative");
else
System.out.println("Number is Zero");
}
}
