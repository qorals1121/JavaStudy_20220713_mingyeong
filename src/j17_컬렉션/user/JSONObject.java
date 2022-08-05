package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {
		
		Map<String, Object> datamap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		
		datamap.put("count", 1118);
		datamap.put("next", "http:/pokeaip.co/api/v2/pokemon/?offset=3&limit=3");
		datamap.put("previous", null);
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "bulbasaur");
		map1.put("url", "https://pokeapi.co/api/v2/pokemon/1/");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "ivysaur");
		map2.put("url", "https://pokeapi.co/api/v2/pokemon/2/");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "venusaur");
		map3.put("url", "https://pokeapi.co/api/v2/pokemon/3/");
		
		list.add(map1);
		list.add(map2);
		
		datamap.put("result", list);
		
		System.out.println(datamap);
	
		
	
	}

}
