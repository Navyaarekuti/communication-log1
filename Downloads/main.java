import java.io.*;
import java.util.*;
import java.math.*;
public class main
{
public static void main(String args[])
  {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1;
if(n%2==0)
n1=n/2;
else
n1=n/2+1;
int a[]=new int[n1];
int b[]=new int[n1];
a=fib(n1);
b=p(n1);
int c[]=new int[n];
for(int i=0,j=0;i<n && j<n1;j++)
{
c[i]=a[j];
c[i+1]=b[j];
i=i+2;
}
for(int i=0;i<n;i++)
{
System.out.println(c[i]);
}

System.out.println(c[n-1]);
  }
 
static int i=0;
static int[] fib(int n1)
{
int[] aa=new int[n1];
aa[0]=1;
aa[1]=1;
for(int i=2;i<n1;i++)
aa[i]=aa[i-1]+aa[i-2];
return aa;
}
//static int a1[]=new int[7];
static int[] p(int n1){
int a1[]=new int[7];
int j=2;
Boolean b;
BigInteger b1;
for(int i=0;i<n1;i++)
{
b1=new BigInteger(Integer.toString(j));
if(b1.isProbablePrime(1))
{a1[i]=j;
j++;
}
else
{
while(!b1.isProbablePrime(1))
{j++;
b1=new BigInteger(Integer.toString(j));

}
a1[i]=j;
j++;
}
}
return a1;
}
}