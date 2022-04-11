package com.callor.method;

public class Method_02 {
	
	/*
	 * 다음 코드가 오류 없이 실행 되도록 코드를 완성하시오
	 */

	public static void main(String[] args) {
		
		/*
		 * 명령문 해석
		 * 1. num()를 실행하여 => num()를 호출하여 실행하고
		 * 2. num()가 return 하는 데이터를 intNum변수에 저장하라
		 */

		int intNum1 = num();
		double doNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = fNum();
		boolean bYes = bYes();

		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(doNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);

	}

	public static String nation() {
		return "대한민국";
	}

	public static boolean bYes() {
		return true;
	}

	public static float fNum() {
		return 40.0f;
	}

	public static long longNum() {
		return 30;
	}

	public static double doNum() {
		return 20.0;
	}

	public static int num() {
		return 10;
	}

}
