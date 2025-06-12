import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,r,index=0,p=1,res=0,c=0;
	System.out.println("enter no");
	n=sc.nextInt();
	while(n!=0) {
	r=n%10;
	n=n/10;
    index++;
	r=r+c;
	if(index==2) {
	r=r+7;
	}
	if(r>=10) {
	c=r/10;
	r=r%10;
	}
    res=res+r*p;
	p=p*10;
	}
    System.out.println("c---->"+c);
    if(c==1) {
     res=c*p+res;
     }
    System.out.println(res);
	}

}
