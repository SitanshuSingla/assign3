import java.util.*;
public class arm
{public static void main(String ags[])
{
int i,a,count=1,sum=0,rem;
Scanner sc=new Scanner(System.in);

a=sc.nextInt();

while(a!=0)
{
a=a/10;
count++;
}

while(a!=0)
{
rem=a%10;
sum=sum+power(rem,count);
a=a/10;

}
if(a==sum)
{System.out.println(a);}




}}