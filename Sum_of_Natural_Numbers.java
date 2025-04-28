//Sum of Natural Numbers
import java.util.Scanner;
class sum_no
{
public static void main(String args[])
{
int i,n,sum;
Scanner sc=new Scanner(System.in);
i=1;
sum=0;
System.out.println("Enter a Number: ");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i=i+1;
}
System.out.println("Sum is "+sum);
}
}