//Program to create Calculator
import java.util.Scanner;
class choice
{
public static void main(String args[])
{
int a,b,ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first Number: ");
a=sc.nextInt();
System.out.println("Enter Second Number: ");
b=sc.nextInt();
System.out.println("\n\n1 for Addition"+"\n2 for Addition"+"\n3 for Multiplcation\n"+"4 for Division"+"\n\nEnter your choice:");
ch=sc.nextInt();
if(ch==1)
System.out.println("Addition is "+(a+b));
else if(ch==2)
System.out.println("Substraction is "+(a-b));
else if(ch==3)
System.out.println("Multipliction is "+(a*b));
else if(ch==4)
System.out.println("Division is "+(a/b));
else
System.out.println("Invalid Choice You have Entered");
}
}