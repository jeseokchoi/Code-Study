package hashMap;

import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
			//  key   ,  value 값
		
		map.put("people", "사람");	// put메소드를 이용하여 입력
		map.put("baseball", "야구");

		System.out.println(map.get("people"));	// "사람" 출력
						// get메소드를 이용하여 value값 출력
		
		System.out.println(map.get("java"));	// 맵의 key에 해당하는 value가 없을경우 null출력
		
		System.out.println(map.getOrDefault("java", "자바"));		// 이때 null이 아닌 디폴트 값을 얻고싶은 경우 getOrDefault 메소드를 사용
											// "자바" 출력
		
		// containsKey 메소드는 Map에 해당 Key가 있는지를 조사하여 그 결과값을 리턴한다
		System.out.println(map.containsKey("people"));	// true 출력
		
		// remove 메소드는 Map의 항목을 삭제하는 메소드로 key값에 해당되는 아이탬(key, value)을 삭제한 후 값을 리턴한다
		System.out.println(map.remove("people"));	// "사람" 출력
		
		// size 메소드는 Map의 갯수를 리턴한다(위에서 "people"을 삭제하였다)
		System.out.println(map.size());	// 1 출력
		
		
		
		
	}

}
