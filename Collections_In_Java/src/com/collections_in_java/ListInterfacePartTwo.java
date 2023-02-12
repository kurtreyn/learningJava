package com.collections_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfacePartTwo {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(122, 12, 3, 45);

		List<Integer> numbersAl = new ArrayList<>(numbers);

		Collections.sort(numbersAl);

		System.out.println(numbersAl);

	}

}
