
public class IsvalidIpAddress {

	public static void main(String[] args) {
		// Write a program to valid
		String input = "172.16.254  .1";
		input = input.replace('.', ' ');
		String[] data = input.split(" ");

		int num = 0;
		boolean isValid = false;
		if (data.length != 4)
			isValid = false;
		else {
			for (int i = 0; i < data.length; i++) {
				// system.out.println(data[i]+"");
				num = Integer.parseInt(data[i]);
				if ((num >= 0) && (num <= 255)) {
					isValid = true;
					
				}
				else {
					isValid=false;
					break;
				}
			}
		}
		if (isValid == true) {
			System.out.println("valid IPv4 Address");
		} else {
			System.out.println("Not a valid IPv4 Address");

		}
	}

}
