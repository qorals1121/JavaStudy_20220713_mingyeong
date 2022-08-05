package j18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	/*
	 * serialize = 객체를 json으로 변환할 때
	 * desrialize = json을 객체로 변환할 때
	 * 
	 */
	
	@Expose(serialize = true, deserialize = false)
	private int usercode;
	@Expose(serialize = true, deserialize = false)
	@SerializedName("userId") // 출력하는 것을 UserId로 찍히게 하고싶을 때
	private String username;
	@Expose(serialize = false, deserialize = true) // false면 포함이 된다 (값을 true로 넣을 시 true면 포함이 된다)
	private String password; // 출력할 때 값을 포함하고 싶지 않을때 transient 추가
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = false)
	private String email;
	@Expose(serialize = true, deserialize = false)
	private String address;
	@Expose(serialize = true, deserialize = false)
	@SerializedName("phoneNumber")
	private String phone;
	@Expose(serialize = true, deserialize = false)
	private List<String> hobby;

}
