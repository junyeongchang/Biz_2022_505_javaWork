package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {

	public static void main(String[] args) {

		/*
		 * List : interface, 데이터 그룹을 저장하기 위한 type
		 * 		Collection type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할때는 Generic type을 지정한다.
		 * 		1. List에 add하는 데이터를 제한하여
		 * 		잘못된 데이터가 add되는 것을 방지하기 위함
		 * 		2. 메모리 낭비를 막고 성능상 잇점이 있기 때문에
		 * 아래 선언된 List는 Generic type이 AddressVO이다
		 * 여기 List에 데이터를 추가하려면 먼저 AddressVO type의
		 * 		vo 객체를 만들고, 데이터를 저장한 다음 add한다.
		 */
		List<AddressVO> addrList = new ArrayList<>();

		AddressVO adVO = AddressVO.builder().name("홍길동").addr("서울특별시").build();
		addrList.add(adVO);
		/*
		 * VO 데이터를 List에 add 하기 위해서는
		 * 항상 새로운 VO를 생성하고 데이터를 setting하고 add 해야 한다.
		 */
		adVO = new AddressVO();
		adVO.setName("성춘향");
		adVO.setAddr("익산시");
		addrList.add(adVO);

		adVO = AddressVO.builder().name("이몽룡").addr("익산시").build();
		addrList.add(adVO);

		AddrServiceV1 addrServicev1 = new AddrServiceV1();
		addrServicev1.printAddrList(addrList);

	}

}
