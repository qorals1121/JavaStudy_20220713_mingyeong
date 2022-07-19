package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		// 김준일/서재효/임나영/문창배/전나경
		
/*		
		int a = names.indexOf("김");
		int b = names.indexOf("일");
		stringBuilder.append(names.substring(a, b + 1));
		stringBuilder.append("/");

		int a1 = names.indexOf("서");
		int b1 = names.indexOf("효");
		stringBuilder.append(names.substring(a1, b1 + 1));
		stringBuilder.append("/");
		
		int a2 = names.indexOf("임");
		int b2 = names.indexOf("영");
		stringBuilder.append(names.substring(a2, b2 + 1));
		stringBuilder.append("/");
		
		int a3 = names.indexOf("문");
		int b3 = names.indexOf("배");
		stringBuilder.append(names.substring(a3, b3 + 1));
		stringBuilder.append("/");
		
		int a4 = names.indexOf("전");
		int b4 = names.indexOf("경");
		stringBuilder.append(names.substring(a4, b4 + 1));
		
		
		System.out.println(stringBuilder.toString());
		
		System.out.println();
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		stringBuilder2.delete(3, 6);
		stringBuilder2.delete(10, 13);
		stringBuilder2.delete(16, 19);
		stringBuilder2.delete(21, 24);

		System.out.println(stringBuilder2.toString());
		
		*/
		
		
		// 풀이
		System.out.println("============================");
		
		int index = 0;
		
		index = names.indexOf("님");
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		
		System.out.println(stringBuilder.toString());
		
		System.out.println();
	
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		System.out.println(stringBuilder2.toString());
		
		

     	}
	

}
