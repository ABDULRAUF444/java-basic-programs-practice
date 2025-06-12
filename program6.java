package programs;

public class program6 {

	public static void main(String[] args) {
		// welcome to Full stack Development . Good Morning Hyderabad.
				String data="hyderabad bangalore goa hyderabad delhi bombay";
				String words[] = data.split(" ");
				
				int max =0;
				String maxStr = "";
				for(int i=0;i<words.length;i++) {
					if(words[i].contains("")) {
						// 14
						words[i] = words[i].substring(0,words[i].length()-1 );
						System.out.println(words[i]);
					}
					if(words[i].length() > max) {
						max = words[i].length();
						maxStr = words[i];
					}
				}
				System.out.println(data);
				
				
			}




	}


