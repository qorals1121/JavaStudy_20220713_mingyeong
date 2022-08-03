package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentSet {

	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<Student>();
		
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		Student[] students = {student1, student2, student3, student4, student5};
		studentSet.addAll(Arrays.asList(students));

		System.out.println(studentSet);

		
		Iterator<Student> ir = studentSet.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			if(student.getName().equals("서재효")) {
				studentSet.remove(student);			
				break;
			}
		}
		
		System.out.println(studentSet);
		}
	}

	
