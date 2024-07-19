package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores: ");
		int valores = sc.nextInt();
		PrintService<String> ps = new PrintService<>();
		// A partir do momento que instancio com um tipo, não deixará instanciar com outro tipo
		// Type Safety.
		for (int i = 0; i < valores; i++) {
			ps.addValue(sc.next());
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		sc.close();
	}

}
