package pablos.example.com;

import java.util.Scanner;

public class MyView {
	Scanner in = new Scanner(System.in);

	public void showEnterAlfa() {
		System.out.println("Enter alfa's value (use 1-9 button): ");
	}

	public void showEnterBeta() {
		System.out.println("Enter beta's value (use 1-9 button): ");
	}

	public void display(int result) {
		for (int i = 0; i < result; i++) {
			System.out.println((i + 1) + " " + "Hello it's me !");
		}
	}

}
