package programs;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter long number");
		long num = sc.nextLong();
		long r;
		int[] count = {
				0,0,0,
				0,0,0,
				0,0,0,0
				};
		while(num != 0) {
			r = num % 10;//3
			num = num /10;
			count[(int)r]++;// count[3]++
		}
		for(int c=0;c<10;c++) {
			if(count[c]== 0)//if(count[c]>0)
			System.out.println(c);//System.out.println(c+" of elements--->"+count[c]);
		}
    }

}
