package com.odev;

public class GenericSinif<T> {

	private T alan;

	public GenericSinif(T alan) {
		this.alan = alan;
	}

	public T getAlan() {
		return alan;
	}

	public void setAlan(T alan) {
		this.alan = alan;
	}

	public void yazdir() {
		System.out.println("Alan: " + alan);
	}
}
