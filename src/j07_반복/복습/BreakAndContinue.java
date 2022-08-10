package j07_반복.복습;

public class BreakAndContinue {


	public static void main(String[] args) {
		String[] strArray = new String[] {"a", "b", null, null, "e", "f", null, "h"};
		
		for(int i = 0; i < strArray.length; i++) {
			char a = strArray[0].charAt(0);
			if(strArray[i] == null) {
				strArray[i] = Character.toString((char) a + i); // char a~ 빼고 'a' 넣어도 됨
//			if(strArray[i] == null) {
//				char num = (char)(i + 97);
//				String num1 = Character.toString(num);
//				strArray[i] = num1;
			}
			System.out.println("i : " + i + " -> " + strArray[i]);
		}
		
		for(String s : strArray) {
			System.out.println(s);
		}

	}

}
