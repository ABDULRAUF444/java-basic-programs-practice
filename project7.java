package project;

import java.util.Scanner;

public class project7 {

	public static void main(String[] args) {
		//java program to check whether two strings are Anagram
		//listen
		//silent
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char eachCh = ' ';
		boolean isAnagram = true;
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				eachCh = str1.charAt(i);
				if(isCharThere1(str2,eachCh) == false) {
					isAnagram = false;
				}// if
				else {
					isAnagram = false;
					break;
				}
			}// for
				
		}//if
		
		if(isAnagram == true) System.out.println("Yes it is Anagram");
		else System.out.println("Not Anagram");
	}

	private static boolean isCharThere1(String str2, char eachCh) {
		
		char localCh = ' ';
		for(int i=0;i<str2.length();i++) {
			localCh = str2.charAt(i);
			if(localCh == eachCh) {
				return true;
			}
		}
		 return false;
					
				}
			}


