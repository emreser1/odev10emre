package com.odev;

import java.util.List;

public class FindingClass {
	
	public static <T> int findElement(List<T> list, T element) {
	    return list.stream()
	            .filter(e -> e.equals(element))
	            .findFirst()
	            .map(list::indexOf)  
	            .orElse(-1);
	}

}
