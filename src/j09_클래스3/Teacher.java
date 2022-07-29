package j09_클래스3;

public class Teacher extends Person {
	private String subject;
	private int teacherCode;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject, int teacherCode) { //public은 밖에서 접근 가능
		super(name, age);
		this.subject = subject;
		this.teacherCode = teacherCode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}

	@Override
	public String mealTime() {
		return "점심시간 10분 전";
	}
	
	
		

}
