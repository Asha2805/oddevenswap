import java.util.*;
public class oddevenswap
{
public static void main(String[] args)
{
String s;
Scanner q=new Scanner(System.in);
s=q.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(i%2==0)
{
int temp;
temp=ch[i];
ch[i]=ch[i+1];
ch[i+1]=temp;
}
}
for(int j=0;j<s.length();j++)
{
System.out.println(ch[i])
}
}
}
