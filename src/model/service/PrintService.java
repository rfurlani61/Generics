package model.service;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
/*
 * Tornar a classe genérica do tipo T. No programa principal instancio como String ou Integer 
 * ou double
 */
public class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		return list.get(0);
	}
	
	public void print() {
		String print;
		if (list.size() < 1) {
			throw new InvalidParameterException("Lista tem de ter pelo menos 1 elemento");
		}
		else {
			print = "[ " + list.get(0);
			for (int i = 1; i < list.size(); i++) {
				print = print + " , " + list.get(i) ;
			}
			print = print + " ]";
		}
		System.out.println(print);
	}
}