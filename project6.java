package project;

import java.util.Scanner;

public class project6 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the data");
     String data=sc.next();
     char ch;
     String newstr="";
     for(int i = 0;i<=data.length();i++) {
    	 ch=data.charAt(i);
    	 newstr=newstr+ch;
    	 System.out.println("data given by keyborad-----"+data);
    	 
    	 
     }
     
     
	}

}
