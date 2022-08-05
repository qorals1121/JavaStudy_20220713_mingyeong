package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson3 {

	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// Map -> JSON
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 1);
		map.put("message", "json 형변환 테스트");
		map.put("data", user);
		
		String mapJson = gson.toJson(map);
		
		System.out.println(mapJson);
		System.out.println();
		
		// JSON -> Map
		
		Map<String, Object> mapObj = gson.fromJson(mapJson, Map.class);
		System.out.println(mapObj);
		
		Double d = 3.14;
		int dNum = d.intValue(); // 일반 double에선 사용할 수 없지만 클래스형태의 Double에선 사용 가능하다.
		System.out.println(dNum);
		
		mapObj.replace("code", ((Double) mapObj.get("code")).intValue());
		
		System.out.println(mapObj);

	}

}
