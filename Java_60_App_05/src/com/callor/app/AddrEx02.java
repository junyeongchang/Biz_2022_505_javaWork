package com.callor.app;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx02 {
	public static void main(String[] args) {
		AddressVO hong = AddressVO.builder()
							.name("홍길동")
							.tel("010-111-1111")
							.addr("서울특별시")
							.build();
		AddrServiceV1 addrService = new AddrServiceV1();
		/*
		 * printAddr() method는 AddressVO type의 매개변수를 갖고 있다.
		 * 특별히 return type이 없다.
		 */
		addrService.printAddr(hong);
		
	}
}
