package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("\"\t안녕하세요.\""); // 이스케이프 문자
		// \t의 경우 그냥 탭을 눌러 띄울 경우 터미널에서는 인식이 되지만 다른 곳에서는 인식이 되지 않아 \t를 써주는 것이 좋다

		String address = "부산시 동래구 사직동";
		// 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌 
		int index = address.indexOf("동"); // 글자가 중복될 경우 맨처음 글자를 찾아줌
		int index2 = address.lastIndexOf("동"); // 마지막 글자를 찾고싶을 경우 lastIndexOf를 사용한다
		System.out.println(index);
		System.out.println(index2);
		
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subAddress = address.substring(0, 4);
		System.out.println(subAddress);
		
		int a = address.indexOf("동");
		int b = address.lastIndexOf("동");
		String c = address.substring(a, b + 1);
		System.out.println(c);
		
		//해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-'); // 문자
		System.out.println(replaceAddress);
		
		replaceAddress = address.replaceAll("-", " "); //문자열
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);

	
	}

}
