package com.protom.test.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for(var i: list)			//enanched for, itera tra tutti gli elementi di list
			System.out.println(i);
	}

}
