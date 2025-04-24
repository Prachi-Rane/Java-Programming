//How to Take Inputs
import java.io.*;
class input
{
public static void main(String args[])throws IOException
{
int a,b,sum;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a NUmber: ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter a Number: ");
b=Integer.parseInt(br.readLine());
sum=a+b;
System.out.println("The Sum of " + a + " + " + b + " is " + sum);
}

}