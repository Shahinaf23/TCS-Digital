import java.io.*;
import java.util.*;
class hours
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int hrs,mins,newmins,newhrs,newtime;
hrs=sc.nextInt();
mins=sc.nextInt();
hrs=hrs*60;
newmins=hrs+mins;
newtime=(24*60)-newmins;
System.out.println(newtime/60+":"+newtime%60);
}
}