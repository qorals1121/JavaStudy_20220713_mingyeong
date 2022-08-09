package j19_익명클래스.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionForEach2 {

	public static void main(String[] args) {
		// names 리스트, code 리스트 를 만들어서 하나의 map으로 만들어 map에 있는 것들을 순서대로 출력
		String names = "김준일, 강민지, 박진관, 오유리, 조문기, 김호영, 박소영, 고준호,  서재효, 송상헌, 하덕현";
		int studentCode = 20220001;
		
		names = names.replaceAll(" ", "");
		String[] nameArray = names.split(",");
		
		List<String> nameList = new ArrayList<String>();
		for(int i = 0; i < nameArray.length; i++) {
			nameList.add(nameArray[i]);
		}
		List<Integer> studentCodeList = new ArrayList<Integer>();
		for(int i = 0; i < nameArray.length; i++) {
			studentCodeList.add(studentCode + i);
		}
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		for(int i = 0; i < nameList.size(); i++) {
			map.put(studentCodeList.get(i), nameList.get(i));
		}
		
		map.forEach((k, v) -> {
			System.out.print("학번 : " + k);
			System.out.print(", ");
			System.out.println("이름 : " + v);
		});
		
		System.out.println("===========================================================");
		////////////////////////////풀이////////////////////////////////////
		
		List<String> nameList2 = Arrays.asList(names.replaceAll(" ", "").split(","));
		List<Integer> studentCodeList2 = new ArrayList<Integer>();
		Map<Integer, String> studentMap = new TreeMap<Integer, String>();
		
		for(int i = 0; i < nameList.size(); i++) {
			studentCodeList2.add(studentCode + i);
			studentMap.put(studentCode + i, nameList.get(i));
		}
		
		studentMap.forEach((code, name) -> {
			System.out.println("학번 : " + code + ", 이름 : " + name);
		});
		
	
	}

}
