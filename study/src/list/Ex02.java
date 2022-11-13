package list;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
			// 제네릭스(Generics)
			// ArrayList<String> pitches = new ArrayList<String>();		정석	(*앞뒤로 모든 자료형 타입을 적을 경우 인텔리제이, IDE에서는 경고메시지를 출력한다*)
			// ArrayList 안에 담을 수 있는 자료형은 String타입 뿐이다 라고 해석가능
		
			// ArrayList<String> pitches = new ArrayList<>();		선호되는 방식 = 보통 뒷 부분의 자료형은 적지않아도 명확하기 때문에
			
		
			// 제네릭스를 사용하지 않을때는 ArrayList안에 추가되는 객체는 Object 자료형으로 인식된다
			// ArrayList 객체인 pitches에 값을 넣을때는 문제가 안되지만 값을 가져올 경우에는 항상 Object자료형에서 String 자료형으로 형변환(casting)을 해 주어야만 한다
//			ArrayList pitches = new ArrayList<>();	// 제네릭스가 도입되기 전에 사용하던 방식
//			pitches.add("138");
//			pitches.add("129");
//			
//			String one = (String) pitches.get(0);	// Object 자료형을 String 자료형으로 캐스팅(형변환)한다
//			String two = (String) pitches.get(1);
		
			// 제네릭스 사용
			// 제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다
			ArrayList<String> pitches = new ArrayList<>();
			pitches.add("138");
			pitches.add("129");
			
			String one = pitches.get(0);	// 형 변환이 필요없다
			String two = pitches.get(1);
			
			System.out.println(one);
			System.out.println(pitches);
			
			
			
			

	}

}
