package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	
	// AddressVO type의 매개변수 1개를 받기
	public void printAddr(AddressVO vo) {
		System.out.println(vo.toString());
	}

	// AddressVO 배열 type의 매개변수 1개 받기
	// 배열의 개수만큼 AddressVO가 전달된다.
	public void printAddrList(AddressVO[] addrList) {
		for(AddressVO vo : addrList) {
			// 객체만 println()에 전달하면
			// 내부에서 vo.toString() 을 호출하여 문자열을 받아 출력
			System.out.println(vo);
		}
		
//		for (int i = 0; i < addrList.length; i++) {
//			System.out.println(addrList[i].toString());
//		}
	}
	
	public void printAddrList(List<AddressVO> addrList) {
		int size = addrList.size();
		for (int i = 0; i < size; i++) {
			System.out.println(addrList.get(i));
		}
//		for (int i = 0; i < size; i++) {
//			AddressVO adVO = addrList.get(i);
//			System.out.println(adVO.toString());
//		}
//
//		for (AddressVO vo : addrList) {
//			System.out.println(vo);
//		}
	}

}
