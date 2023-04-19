/* wajp to check the number is palindrome or not.  */

import java.io.*;
class palindrome
{
public static void main(String args[])
{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter the number :"));
int orgNo=num;

int rev=0;
while(num!=0){
rev=rev*10+num%10;
num=num/10;
}

if(orgNo==rev){
System.out.println("This is a Palindrome Number...");
}else{
System.out.println("This is not a Palindrome Number....");
}

}
}