import java.util.*;
public class rev
{
public static void main(String ags[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0,n,i;

while(a!=0)
{
n=a%10;
sum=sum*10+n;
a=a/10;
}
System.out.println("Reverse of no is" + sum);

}}