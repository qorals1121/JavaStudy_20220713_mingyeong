package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		
		//리팩토링 2 책 추천
		/*
		 * factoryArray 20
		 * 
		 * 배열의 인덱스가 
		 * 짝수이면 SamsungFactory 생성해서 대입
		 * 홀수이면 LGFactory 생성해서 대입
		 * 
		 * 삼성공장 1 ~ 10
		 * LG공장 1 ~ 10
		 * 
		 * 모든 공장 가동
		 * 
		 * 모든 공장 생산
		 * 
		 * 모든 공장 중지 (세개를 하나의 for문으로 묶기)
		 * 
		 */
		
		Factory[] factoryArray = new Factory[50];
		
		for(int i = 0; i < factoryArray.length; i++) {
			
			if(i % 2 == 0) {
				factoryArray[i] = new SamsungFactory((i + 2) / 2);
				SamsungFactory sFactory = (SamsungFactory) factoryArray[i];
				
				sFactory.start();
				sFactory.produceSmartphone();
				sFactory.stop();
				System.out.println();
				
				
			}else if(i % 2 != 0) {
				factoryArray[i] = new LGFactory((i + 1) / 2);
				LGFactory lgFactory = (LGFactory) factoryArray[i];
				
				lgFactory.start();
				lgFactory.produceSmartTV();
				lgFactory.stop();
				System.out.println();
				
			}else {
				System.out.println("가동불가");
			}
		}
		
		//풀이 
		
		
		for(int i = 0; i < factoryArray.length; i++) {
			if (i % 2 == 0) {
				factoryArray[i] = new SamsungFactory(i / 2 + 1);
			}else {
				factoryArray[i] = new LGFactory(i / 2 + 1);
			}
		}
		
		for(int i = 0; i < factoryArray.length; i++) {
			factoryArray[i].start();
			
			if(factoryArray[i] instanceof SamsungFactory) {
				((SamsungFactory) factoryArray[i]).produceSmartphone();
				
			}else {
				((LGFactory) factoryArray[i]).produceSmartTV();
			}
		
			factoryArray[i].stop();
			System.out.println();
		}
		

	
		
	}
}
