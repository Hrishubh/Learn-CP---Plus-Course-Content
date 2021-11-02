package Basic_Data_Structures_Course;


public class L15_HashMapClient {

	public static void main(String[] args) {

		L15_HashMap<String, Integer> map = new L15_HashMap<>();

		map.put("Ind", 200);
		map.put("Aus", 210);
		map.put("Pak", 110);
		map.put("Bd", 150);
		map.put("Afg", 180);
		map.put("SL", 205);
		
		map.display();
		
		System.out.println(map.get("Ind"));
		System.out.println(map.get("SL"));
		
		map.put("Bd", 152);
		map.display();
		
		map.put("S", 200);
		map.put("T", 210);
		map.put("U", 110);
		map.put("V", 150);
		map.put("W", 180);
		
		
		map.display();
		System.out.println(map.keySet());

	}

}
