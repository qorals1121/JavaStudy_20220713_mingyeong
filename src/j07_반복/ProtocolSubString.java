package j07_반복;

public class ProtocolSubString {

	/*
	 * @ 뒤에 오는 문자열이 명령어
	 * : 뒤에 오는 문자열은 내용
	 */
	public static void main(String[] args) {
		
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@Test:Test메세지";
//		String message = null;
//		String to = null;
//		String from = null;
//		String sendDate = null;
		
		
//		for(int i = 0; i < data.length(); i++) {
//			String subStr = data.substring(i, i + 1);
//			if(data.equals("@")) {
//				int index = 0;
//				if(data.equals(":")) {
//					int index2 = 0;
//					message = data.substring(index2, i);
//				}
//			}
//	}
		
		//풀이
		
		while(true) { // for(;ture;)로 대체 가능
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
	
			System.out.println(command + " : " + content);
//			if(command.equals("Message")) {
//				message = content;
//				
//			}else if(command.equals("To")) {
//				to = content;
//				
//			}else if(command.equals("From")) {
//				from = content;
//				
//			}else if(command.equals("SendDate")) {
//				sendDate = content;
//			}
			
			if(nextCommandIndex == -1) {
			break;
			}
			
			data = data.substring(nextCommandIndex);
		}
				
			
		
//		
//		System.out.println("Message : " + message);
//		System.out.println("To : " + to);
//		System.out.println("From : " + from);
//		System.out.println("SendDate : " + sendDate);

	}

}
