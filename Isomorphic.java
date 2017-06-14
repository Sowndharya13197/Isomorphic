import java.io.*;
import java.util.Scanner;
public class Isomorphic
{
    public static void main(String args[])
    {
    int i,len,len1,j,count=0;
    char a[]=new char[20];
    char b[]=new char[30];
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String str1=s.nextLine();
      len=str.length();
      len1=str.length();
     for(i=0;i<len;i++)
      { a[i]=str.charAt(i);
      } 
     for(i=0;i<len1;i++)
      {
      b[i]=str1.charAt(i);
      }if(len==len1)
      {
      for(i=0;i<len;i++)
          { for(j=i+1;j<len;j++)
          {
              if(a[i]==a[j]&&b[i]==b[j])
              {count++;
              }}}}
              if(count>=1)
      {System.out.println("true");
      }
      else
      {System.out.println("false");

      }  
}}
