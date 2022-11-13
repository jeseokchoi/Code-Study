package list;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
//		String[] arr = { "138", "129", "142" };	// 데이터 배열 생성
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList(arr));	// asList 메소드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 생성할 수 있다
//		System.out.println(pitches);	// [ 138, 129, 142 ]

		
//		// 다음과 같이 String 배열 대신 String 자료형을 여러개 전달하여 생성할 수도 있다
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//		System.out.println(pitches);

		
//		// ArrayList의 요소를 콤마(",")로 구분하여 하나의 문자열로 만들기 = 138, 129, 142 출력
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//		String result = "";
//		for(int i = 0; i < pitches.size(); i++) {
//			result += pitches.get(i);
//			result += ",";									// 콤마를 추가한다.
//		}
//		result = result.substring(0, result.length() - 1);	// 마지막 콤마는 제거한다.
//		System.out.println(result);							// 138, 129, 142 출력
		
		// String.join을 사용하여 간단하게 출력할 수 있다
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//		String result = String.join(",", pitches);
//		System.out.println(result);
		// String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다
		
		// String.join은 다음처럼 문자열 배열에도 사용할 수 있다
		String[] pitches = new String[] { "138", "129", "142" };
		String result = String.join(",", pitches);
		System.out.println(result);
		
		
	}

}
