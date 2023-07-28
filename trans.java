import java.io.*;
import java.util.*;
class trans
{
public static void main(String[]args)
{
int flag=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]==30||arr[i]==60||arr[i]==120)
{
flag=1;
}
else
{
	flag=0;
	break;
}
}
if(flag==1)
System.out.println("Successfull transaction");
else
System.out.println("Transaction failed");
}
}