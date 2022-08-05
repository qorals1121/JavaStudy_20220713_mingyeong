package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {

	public static void main(String[] args) {
		// Gson 객체 생성하는 방법
		
		// 1. Gson() 생성자를 통해 생성
		Gson gson1 = new Gson(); // setPrettyPrinting이 없기때문에 builder로 만들어주는 것이 좋다

		// 2. GsonBuilder() 생성자를 통해 생성
		Gson gson2 = new GsonBuilder().create();
		
		// JSON 이쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create(); //create는 필수
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "skjil1218@kakao.com");
		
		String json1 = gson3.toJson(map);
		String json2 = gson2.toJson(map);
		
		System.out.println(gson1.toString());
		System.out.println(gson3.toString());
		System.out.println(json1);
		System.out.println(json2);
	}

}
