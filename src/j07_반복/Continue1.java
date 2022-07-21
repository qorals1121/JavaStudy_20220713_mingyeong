package j07_반복;

public class Continue1 {

		public static void main(String[] args) {
//			for(int i = 0; i < 10; i++) {
//				if(i % 2 == 0) {
//					continue; // 자신 밑에 있는 것은 무시하고 다음 반복으로 넘어가라는 명령어
//				}
//				System.out.println("i : " + i);
//				}
				String address = "부산 동래구 사직동 중앙대로";
				String tempAddress = null;
				for(int i = 0; i < address.length(); i++) {
					String subaddress = address.substring(i, i + 1);
					if(subaddress.equals(" ")) {
						continue;
					}
					if(i == 0) {
						tempAddress = subaddress;
					}else {
						tempAddress += subaddress;						
					}
				}
				System.out.print(tempAddress);
			}
		}

