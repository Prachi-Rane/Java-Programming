import java.util.Scanner;
class demons
{
public static void main(String args[])
{
int length,breadth,area;

Scanner sc= new Scanner(System.in);

System.out.println("Enter Length: ");
length=sc.nextInt();

System.out.println("Enter Breadth: ");
breadth=sc.nextInt();

area=length*breadth;
System.out.println("Area of Rectangle is "+area);
}
}