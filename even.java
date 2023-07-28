import java.io.*;
import java.util.*;
class even
{
public static void main(String[]args)
{
int flag=0;
Scanner sc=new Scanner(System.in);
String c="";
String a=sc.next();
String b=sc.next();
for(int i=0;i<a.length;i++)
{
if(a.charAt(i)==b.charAt(i))
{
flag=1;
}
else
{
c=a.substring(i,a.length);
}
}
for(int i=0;i<c.length;i++)
{
if(c.charAt(i)<c.charAt(i+1))
s=c.charAt(i);
}

if(flag==1)
System.out.println(0);

