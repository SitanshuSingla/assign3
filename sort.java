import java.util.*;
public class sort{
public static void main(String ags[])
{
Scanner sc=new Scanner(System.in);
int a[]={1,4,6,7,8,9,10},temp,i,b,flag=0;
b=sc.nextInt();
for(i=0;i<8;i++)
{


if(a[i]==b)
{flag=1;
break;}
}
if(flag==1)
{System.out.println("found");}
else
{System.out.println("not found");}


}}