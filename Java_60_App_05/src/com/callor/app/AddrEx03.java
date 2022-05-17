package com.callor.app;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {

	public static void main(String[] args) {

		AddressVO[] addrList = new AddressVO[3];

		addrList[0] = new AddressVO();
		addrList[0].setName("성춘향");
		addrList[0].setAddr("익산시");

		addrList[1] = AddressVO.builder().name("이몽룡").addr("익산시").build();

		addrList[2] = new AddressVO();
		addrList[2].setName("장보고");
		addrList[2].setAddr("완도군");

		AddrServiceV1 addrService = new AddrServiceV1();
		addrService.printAddrList(addrList);
	}

}
