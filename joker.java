import java.io.*;
import java.util.*;
class joker
{
public static void main(String[]args)
{
int[]arr=new int[4];
int temp;
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
	if(arr[0]==0)
	{
		for(i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
	}
	arr[arr.length-1]=0;
	
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}

}
}

