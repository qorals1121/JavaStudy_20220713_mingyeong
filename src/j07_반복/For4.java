package j07_반복;

public class For4 {

	public static void main(String[] args) {
	
		String address = "부산 동래구 사직동 중앙대로";
		
		for(int i = 0; i < address.length(); i++) {
			String subStr = address.substring(i, i + 1);
			if(subStr.equals(" ")) {
				int index = 0;
				String temp = address.substring(0, i); //i는 띄어쓰기 일 수 밖에 없음. (if문이 띄어쓰기를 골라내는 것이라서)
				if(temp.contains(" ")) {
					index = temp.lastIndexOf(" ") + 1;	// 중앙대로는 끝에 띄어쓰기가 없기 때문에 따로 골라내준다.
					System.out.println(temp.substring(index, i));
				}else {
					System.out.println(temp.substring(0, i));
				}
				
			}
			if(i == address.length() - 1) {
				System.out.println(address.substring(address.lastIndexOf(" ") + 1));
			}
			
	}

}
}