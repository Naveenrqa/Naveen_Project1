package com.excelr.basics;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(18);
		list.add(18);
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(50);
		set.add(30);
		System.out.println(set);
		
		for (Integer abc : set) {
			System.out.println(abc);
		}
		
	}
}
