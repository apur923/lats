package com.comparator;

import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.getAge()-o2.getAge();
	}

}
// jkebsjfdgj