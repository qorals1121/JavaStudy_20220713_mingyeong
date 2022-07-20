package j07_반복.랜덤;

import java.util.UUID;

public class UUID1 {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(uuid); // 16진수, 파일 입출력, 임시토큰 등을 만들 때 사용함

	}

}
