package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList pitches = new ArrayList<>();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		// get은 특정 인덱스의 값을 추출할 수 있다
		System.out.println(pitches.get(1));		// 129
		
		// size는 ArrayList의 갯수를 출력할 수 있다
		System.out.println(pitches.size());		// 3
		
		// contains는 리스트 안에 해당 항목이 있는지 판별하여 boolean값으로 리턴한다
		System.out.println(pitches.contains("142"));	// true
		System.out.println(pitches.contains("141"));	// false
		
		// remove(객체) 객체의 경우 리스트에서 객체에 해당하는 항목을 삭제하고 삭제된 결과를 리턴한다
		System.out.println(pitches.remove("129"));	// true
		System.out.println(pitches.remove("120"));	// false
		
		//remove(인덱스)	인덱스의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다
		System.out.println(pitches.remove(0));	// 138
		
		
		
		
	}

}
