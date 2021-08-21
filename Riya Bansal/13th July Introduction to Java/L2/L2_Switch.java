package Introduction_to_Programming_In_Java;

public class L2_Switch {

	public static void main(String[] args) {

		int number = 42;

		String size; //Medium //large //Extra Large //Unknown

		switch (number) {

		case 29:
			size = "Small";
			//break;

		case 42:
			size = "Medium";
			System.out.println("Medium");
			//break;

		case 44:
			size = "Large";
			System.out.println("Large");
			//break;

		case 48:
			size = "Extra Large";
			System.out.println("Extra Large");
			//break;

		default:
			size = "Unknown";
			//break;
		}
		
		System.out.println(size);

	}

}
