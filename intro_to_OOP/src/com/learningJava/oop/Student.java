package com.learningJava.oop;

public class Student {

	public static void main(String[] args) {
		String names[] = { "Jon", "Kurt" };
		int[] marks = { 1, 3, 5, 9 };

//		System.out.println(marks[0]);

		int[] grades = new int[8];

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

	}

}
