package Introduction_to_Programming_In_Java_2;

public class L1_Data_Types_Demo {

	public static void main(String[] args) {
		
		//case 1
		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;
		
		
		//by = sh;
		//by = in;
		//by = lo;
		
		sh = by;
		//sh = in;
		//sh = lo;
		
		in = by;
		in = sh;
		//in = lo;
	
		lo = by;
		lo = sh;
		lo = in;
		
		//case 2
		in = 10;
		by = (byte) 384;
		
		System.out.println(by);
		
//		for(byte i = 0; i <= 128; i++) {
//			System.out.println(i);
//		}
		
		//case 3
		
		in = (int) 10000000000L;
		System.out.println(in);
		
		//case 4
		float f = 5.6f;
		double d = 6.7;
		
		//f = d;
		d = f;
		
		//case 5
		in = (int)f;
		System.out.println(in);
		
		in = 50;
		f = in;
	
		System.out.println(f);
		
		//case 6
		boolean b = true;
		
		if(b) {
			
		}
		
		//b = 0;
		
		//case 7
		char ch = 'a';
		System.out.println(ch);

		ch = 100;
		System.out.println(ch);
		
		in = 'q';
		System.out.println(in);
		
		System.out.println((int)'E');
		System.out.println((char) 200);
		
		ch = (char) (ch + 1); //100 + 1
		System.out.println(ch);
		
		ch = (char) 65536;
		System.out.println(ch);
		
		//case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");
		
		System.out.println(2 + '\t' + 3);
	}

}
