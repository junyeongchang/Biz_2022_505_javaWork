package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec03 {
	public static void main(String[] args) {
		List<AddressVO> addrs = new ArrayList<>();
		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAge(30);
		addrs.add(aVO);
		aVO = AddressVO.builder().name("이몽룡").age(20).build();
		addrs.add(aVO);
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());

		// 요소데이터가 아직 공백(black) 객체를 list에 추가하고
		// 추가된 위치는 전체 리스트 size - 1 번 위치가 된다
		addrs.add(new AddressVO());
		// 리스트의 size 값을 확인하고
		int size = addrs.size();
		// 마지막에 추가된 데이터의 위치는 size - 1 이다.
		// size-1 위치의 객체에 요소 값들을 setting
		addrs.get(size - 1).setName("임꺽정");
		addrs.get(size - 1).setAge(40);

		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}

		size = addrs.size();
		// list.get(위치) 형식으로 VO를 추출하고
		// 각 요소변수를 getter
		// list.get(위치).getAge()
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// 배열의 i요소인 aVO의 나이가 더 큰값이면
				if (addrs.get(i).getAge() > addrs.get(j).getAge()) {
					// 배열의 i번째 요소를 _tVO에 임시저장
					// 배열의 i번째 요소를 대피
					AddressVO _tVO = addrs.get(i);
					// i번째 요소위치에 j번째 요소값을 복사
					addrs.set(i, addrs.get(j));
					// 대피해 두었던 i번째 요소 값을 j번째에 복사
					addrs.set(j, _tVO);
				}
			}
		}
		System.out.println(Line.dLine(70));
		for (AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
	}
}
