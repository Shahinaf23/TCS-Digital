import java.io.*;
import java.util.*;
class Event
{
public static void main(String[]args)
{
int j;
Scanner sc=new Scanner(System.in);
String str=sc.next();
for(int i=0;i<str.length();i++)
{
j=i+1;

if(str.charAt(i)=='E' && str.charAt(j)=='F')
{
str=str.replace("E","");
str=str.replace("F","");
}
if(str.charAt(i)=='G')
{
str=str.replace("G","");
}
}
System.out.println(str);
}
}
