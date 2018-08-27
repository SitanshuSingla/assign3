public class array{
public static void main(String ags[])
{
int a[]={1,1,1,1,0,0,1,0},temp,i,j;
for(i=0;i<8;i++)
{
for(j=0;j<8;j++)
{
if(a[i]<a[j])
{temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int b:a)
{System.out.println(b);}
}}