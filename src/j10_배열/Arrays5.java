package j10_배열;

import j09_클래스.접근지정자.Student.Student;

public class Arrays5 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("=============================================");
		
		Student[] students = new Student[5];
		students[0] = new Student();
		students[0].setName("김준일");
		System.out.println(students[0].getName());
		students[1].setName("김준이");
		
		System.out.println(students[0].getName());
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students);
		}
		
		
		int num = 0;
		
		Student student = null;
		
	}

}
