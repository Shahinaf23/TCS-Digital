import java.io.*;
import java.util.*;
class girl
{
static int fact(int n)
{
int fact1=1;
for(int i=n;i>0;i--)
{
fact1=fact1*i;
}
return fact1;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int p=sc.nextInt();
int e=sc.nextInt();
int pencils=fact(n)/(fact(p)*fact(n-p));
int erasers=fact(m)/(fact(e)*fact(m-e));
System.out.println(pencils);
System.out.println(erasers);
}
}