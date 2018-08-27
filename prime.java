import java.util.*;
public class prime{
public static void main(String ags[])
{
int i,j,flag=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

for(i=1;i<=a;i++)
{
flag=0;
for(j=2;j<=i/2;j++)
{if(i%j==0)
{flag=1;
break;
}
}
if(flag==0)
{System.out.println(i);}
}


}}