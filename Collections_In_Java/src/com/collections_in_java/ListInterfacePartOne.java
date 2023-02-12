package com.collections_in_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfacePartOne {
	public static void main(String[] args) {
		// if created with "of" it will be immutable
		List<String> words = List.of("Apple", "Bat", "Cat");

		System.out.println(words);

		System.out.println(words.size());

		System.out.println(words.isEmpty());

		System.out.println(words.get(0));

		System.out.println(words.contains("Dog"));

		System.out.println(words.indexOf("Cat"));

		List<String> wordsArrayList = new ArrayList<String>(words);
		List<String> wordsLinkedList = new LinkedList<String>(words);
		List<String> wordsVector = new Vector<String>(words);

		wordsArrayList.add("Dog");
		wordsArrayList.add(2, "Elephant");

		List<String> newList = List.of("Yak", "Zebra");

		wordsArrayList.addAll(newList);

		wordsArrayList.set(2, "Fish");

		wordsArrayList.remove(1);
		wordsArrayList.remove("Zebra");

		System.out.println(wordsArrayList);

		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}

		for (String word : words) {
			System.out.println(word);
		}

		Iterator<String> wordsIterator = words.iterator();

		while (wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}

	}

}
