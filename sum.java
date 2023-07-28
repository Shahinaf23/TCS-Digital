import java.io.*;
import java.util.*;
class sum
{
public static void main(String[]args)
{
int sum=0;
Scanner sc=new Scanner(System.in);
String str=sc.next();
if((str.charAt(0)=='0'||str.charAt(0)=='1'||str.charAt(0)=='2'||str.charAt(0)=='3'||str.charAt(0)=='4'||str.charAt(0)=='5'||str.charAt(0)=='6'||str.charAt(0)=='7'||str.charAt(0)=='8'||str.charAt(0)=='9')&&str.charAt(str.length()-1)=='0'||str.charAt(str.length()-1)=='1'||str.charAt(str.length()-1)=='2'||str.charAt(str.length()-1)=='3'||str.charAt(str.length()-1)=='4'||str.charAt(str.length()-1)=='5'||str.charAt(str.length()-1)=='6'||str.charAt(str.length()-1)=='7'||str.charAt(str.length()-1)=='8'||str.charAt(str.length()-1)=='9')
{
sum=Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
}
else
{
sum=str.charAt(0)+str.charAt(str.length()-1);
}
System.out.println(sum);
}
}
