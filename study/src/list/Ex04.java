package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {

	public static void main(String[] args) {
		// 리스트 정렬하기
		
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		pitches.sort(Comparator.naturalOrder());	// 오름차순으로 정렬
		System.out.println(pitches);	// [129, 138, 142]출력
		
		// Comparator.naturalOrder() 오름차순 (순방향) 정렬
		// Comparator.reverseOrder() 내림차순 (역방향) 정렬

	}

}
