package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

@Builder
@NoArgsConstructor
//@RequiredArgsConstructor //final을 달아주고 nonNull을 달아준 상태에서 값이 필수인 애들을 데리고 생성함 (= 사용하려면 nonnull 필수)
@AllArgsConstructor
public class User {
	
	private String email; //상수라는 것은 무조건 초기화를 해야한다. 초기화를 해줄 수 있는건 required~~~뿐. 나머지는 사용 불가
	private String name;
	@NonNull //값을 넣지 않으면 오류가 뜨게한다. 무조건 값이 있어야함.
	private String username;
	@NonNull
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

}
