package com.odev;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		GenericSinif<String> strSinif = new GenericSinif<>("String İfade");
		strSinif.yazdir();

		GenericSinif<Integer> intSinif = new GenericSinif<>(100);
		intSinif.yazdir();
		
		
		
		
        List<String> list = Arrays.asList("Elma", "Armut", "Muz", "Çilek");

        int index = FindingClass.findElement(list, "Muz");
        System.out.println("Muz'ın indeksi: " + index); // 2

        index = FindingClass.findElement(list, "Karpuz");
        System.out.println("Karpuz'un indeksi: " + index); // -1

        
	}
	
}
