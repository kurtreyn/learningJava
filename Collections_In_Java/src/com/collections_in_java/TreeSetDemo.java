package com.collections_in_java;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> treeNumbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));

		System.out.println("treeNumbers: " + treeNumbers);

		System.out.println(treeNumbers.floor(40));
		System.out.println(treeNumbers.lower(34));
		System.out.println(treeNumbers.ceiling(40));
		System.out.println(treeNumbers.higher(40));
		System.out.println(treeNumbers.subSet(20, 80));
	}

}
