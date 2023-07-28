import java.io.*;
import java.util.*;
class freq
{
public static void main(String[]args)
{
int count=1,count1=0;
Scanner sc=new Scanner(System.in);
String str=sc.next();
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(str.charAt(i)==str.charAt(j))
{
count++;
}
}
if(count%2==0)
{
count1+=count;
}
count=0;
}
System.out.println(count1);
}
}
