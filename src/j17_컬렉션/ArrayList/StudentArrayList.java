package j17_컬렉션.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		

		

		/*
		 * studentList
		 * Student 배열을 생성하고 그 배열을 리스트로 변환 후에 
		 * 새로운 ArrayList를 생성하여 전체를 추가
		 */
		
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		Student[] studentList = {student1, student2, student3, student4, student5};
		studentArrayList.addAll(Arrays.asList(studentList));
		System.out.println(studentArrayList);
		
		for(int i = 0; i < studentList.length; i++) {
			studentArrayList.add(studentList[i]);
		}
		System.out.println(studentArrayList);
		
		for(Student student : studentArrayList) {
			System.out.println(student);
		}
		
		/*
		 * 학생 이름이 서재효인 객체를 찾아서
		 * 출력하고 삭제하기.
		 *
		 */
		
//		for(Student student : studentArrayList) {
//			if(student.getName().equals("서재효")) {
//				System.out.println(student);
//				studentArrayList.remove(student);
//			} 
//		}
		
		for(int i = 0; i < studentArrayList.size(); i++) {
			Student student = studentArrayList.get(i);
			
			if(studentArrayList.get(i).getName().equals("서재효")) {
				System.out.println(studentArrayList.get(i));
				studentArrayList.remove(i);
			}
		}
		
		for(Student student : studentArrayList) {
			if(student.getName().equals("전나경")) {
				System.out.println(student);
				studentArrayList.remove(student);
			}
		}
		
		System.out.println(studentArrayList);

	
		
	}

}
