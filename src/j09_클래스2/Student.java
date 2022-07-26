package j09_클래스2;

public class Student {
	
	private String studentName;
	private int stduentYear;
	private String studentAddress;
	private String studentPhone;
	
	// 기본 생성자
	public Student() {
	//	System.out.println("학생 객체(인스턴스)를 생성할 때 호출됨. (NO)");
	}

	// 전체 생성자
	public Student(String studentName, int stduentYear, String studentAddress, String studentPhone) {
		super();
	//	System.out.println("학생 객체(인스턴스)를 생성할 때 호출됨. (ALL)");
		this.studentName = studentName;
		this.stduentYear = stduentYear;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStduentYear() {
		return stduentYear;
	}

	public void setStduentYear(int stduentYear) {
		this.stduentYear = stduentYear;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", stduentYear=" + stduentYear + ", studentAddress="
				+ studentAddress + ", studentPhone=" + studentPhone + "]";
	}
	
	
	

}
