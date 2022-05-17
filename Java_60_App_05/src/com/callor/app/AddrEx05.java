package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx05 {

	public static void main(String[] args) {

		List<AddressVO> addrList = new ArrayList<>();

		AddressVO adVO = AddressVO.builder().name("홍길동").addr("서울특별시").age(33).build();
		addrList.add(adVO);

		adVO = new AddressVO();
		adVO.setName("성춘향");
		adVO.setAddr("익산시");
		adVO.setAge(16);
		addrList.add(adVO);

		adVO = AddressVO.builder().name("이몽룡").addr("익산시").age(19).build();
		addrList.add(adVO);

		AddrServiceV1 addrServicev1 = new AddrServiceV1();
		// 3명의 데이터 출력하기
		addrServicev1.printAddrList(addrList);

		adVO = AddressVO.builder().name("임꺽정").tel("010-111-1234").age(45).build();

		// addrList 리스트의 2번째 데이터를 임꺽정 데이터로 변경하고 싶다.
		// addrList.add(AddressVO) : 데이터를 추가하기
		addrList.set(2, adVO);

		int size = addrList.size();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (addrList.get(i).getAge() > addrList.get(j).getAge()) {
					AddressVO _t = new AddressVO();
					_t = addrList.get(i);
					addrList.set(i, addrList.get(j));
					addrList.set(j, _t);
				}
			}
		}
		addrServicev1.printAddrList(addrList);

	}

}
