package com.collections_in_java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set only allows unique values, no duplicates
		Set<Integer> hashNumbers = new HashSet<>();

		hashNumbers.add(765432);
		hashNumbers.add(76543);
		hashNumbers.add(7654);
		hashNumbers.add(765);
		hashNumbers.add(76);

		System.out.println("hashNumbers " + hashNumbers);

		Set<Integer> linkedNumbers = new LinkedHashSet<>();

		linkedNumbers.add(765432);
		linkedNumbers.add(76543);
		linkedNumbers.add(7654);
		linkedNumbers.add(765);
		linkedNumbers.add(76);

		System.out.println("linkedNumbers " + linkedNumbers);

		Set<Integer> treeNumbers = new TreeSet<>();

		treeNumbers.add(765432);
		treeNumbers.add(76543);
		treeNumbers.add(7654);
		treeNumbers.add(765);
		treeNumbers.add(76);

		System.out.println("treeNumbers " + treeNumbers);

	}

}
