package com.collections_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

};

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Kurt"), new Student(100, "Adam"), new Student(2, "Eve"));

		List<Student> studentsAl = new ArrayList<>(students);

//		System.out.println(studentsAl);

		Collections.sort(studentsAl);

		System.out.println("Descending" + studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());

		System.out.println("Ascending" + studentsAl);
	}

}
