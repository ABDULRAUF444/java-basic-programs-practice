package demo2;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) 
	{
	 Scanner xy=new Scanner(System.in); 
     System.out.println("enter char value");
     char ch =xy.next().charAt(0);
     
     if((ch>='a')&&(ch<='z')){
    	System.out.println("yes it is a alhapet");
    }
    else if((ch>='A')&& (ch<='Z')) {
    	System.out.println("yes it is Alphabet");
    }
    else {
    	System.out.println("not alphabet");
    }
    
    			
    	
    
    
    
    }
	}


