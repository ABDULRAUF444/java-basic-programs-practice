import java.util.Scanner;

public class demo6 {//(replace of the number)

	public static void main(String[] args) {
		//for a given no 568923-----replace if no is 9 by 3
		int r,p=1,res=0;
		Scanner abc=new Scanner(System.in);
		System.out.println("enter number");
		int n=abc.nextInt();
		
		
		while(n!=0) {
		r=n%10;
		if(r==7)r=5;
		n=n/10;
		res=res+r*p;
		p=p*10;
		//if(n==0)break;
	}
    System.out.println(res);
    
}
}
