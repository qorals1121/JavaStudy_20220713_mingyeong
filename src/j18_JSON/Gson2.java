package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = UserService.createUser();
		Gson gson = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.serializeNulls()
				.setPrettyPrinting()
				.create();
		//serializeNulls 가 들어가면 벨류값에 null이 있어도 출력된다.
		
		// 객체를 JSON으로 변환 -> toJson(객체)
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		System.out.println();
		
		// JSON을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());

	}

}
