package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Empimpl  {
	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<>();
		emp.add(new Emp("apurva",26,"hinganghat"));
		emp.add(new Emp("Kabeer",27,"nagpur"));
		emp.add(new Emp("nishant",26,"wardha"));
		
		System.out.println(emp);
		Collections.sort(emp , new AgeComparator());
		System.out.println(emp);
		ArrayList<Emp> emp1 = new ArrayList<>(emp);
		Collections.sort(emp1, new CityComparator());
		System.out.println(emp1);
		
	}

}
