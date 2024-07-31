package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2024/07/19
 * 이름 : 김보경
 * 내용 : 로또번호 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count<=5; count++) {
			System.out.println(makeLotto());
		}
	}
	//반환타입 보고 넣을 것
	public static Set<Integer> makeLotto(){
		
		Set<Integer> lottoSet = new HashSet<>();
		// ;; 의미 : 무한루프
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);
					
			lottoSet.add(num);
					
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
