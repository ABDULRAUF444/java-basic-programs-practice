package project;

public class project11 {

	public static void main(String[] args) {
      int[] num= {85,25,37,48,56,95,65};
      int max=num[0],min=num[0];
      
      for(int i=0;i<num.length;i++) {
    	  if(num[i]>max) {
    		  max=num[i];
    		  
    		  
    	  }
    	  if(num[i]<min) {
    		  min=num[i];
    		  
    		  
    	  }
      }
      System.out.println("max----->"+max);
      System.out.println("min----->"+min);
      
	}

}
