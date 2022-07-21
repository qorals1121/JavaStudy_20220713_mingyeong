package j08_메소드;

public class Method1 {
	
	public static void printData(String data) { //(String data) => 지역변수
		
		while(true) { 
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
	
			System.out.println(command + " : " + content);

			if(nextCommandIndex == -1) {
			break;
			}
			
			data = data.substring(nextCommandIndex);
		}
		
		System.out.println("==========================================");
		System.out.println();
				
	}

	public static void main(String[] args) {
		
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21@Test:Test메세지";
		String data2 = "@Message:안녕하세요2.@To:김준일2@From:김준이3@SendDate:2022/07/212@Test:Test메세지2";
		String data3 = "@Message:안녕하세요3.@To:김준일2@From:김준이3@SendDate:2022/07/213@Test:Test메세지3";
		
		printData(data);
		printData(data2);
		printData(data3);

	}

}
