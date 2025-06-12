import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		System.out.println("enter no of colos");
		int c=sc.nextInt();
		
		
		int[][] matrix=new int[r][c];
		
		
		for(int rows=0;rows<r;r++) {
			for(int colos=0;colos<c;c++) {
				
				
				 matrix[rows][colos]=sc.nextInt();
				 
				
			}
		}
		//print
		for(int rows=0;rows<r;r++) {
			for(int colos=0;colos<c;c++) {
				
				
				System.out.print(matrix[rows][colos]+" ");
				
			}
		}
		    System.out.println();		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		                      
		         
		
		
		

	}

}
