package com.exampleee;

import java.util.Scanner;

public class FInalcalculator {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		System.out.println("Input the operation:");
		String x = input.nextLine();

		while (!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/") && !x.equals("div")
				&& !x.equals("mod") && !x.equals("^")) {
		
			System.out.println("Enter correct operation:");
			x = input.nextLine();
		}

		System.out.println("Input the numbers:");
		var a = input.nextInt();
		var b = input.nextInt();

		switch (x) {
		case "+": {
			System.out.println(a + b);
			break;
		}

		case "-": {
			System.out.println(a - b);
			break;
		}

		case "*": {
			System.out.println(a * b);
			break;
		}

		case "/": {
			if (b == 0) {
				System.out.println("Cannot be divided by 0");
			} else {
				System.out.println((float) a / b);
			}
			break;
		}

		case "div": {
			if (b == 0) {
				System.out.println("Cannot be divided by 0");
			} else {
				System.out.println(a / b);

			}
			break;
		}

		case "mod": {
			if (b == 0) {
				System.out.println("Cannot be divided by 0");
			} else {
				System.out.println(a % b);

			}
			break;
		}
		case "^": {
			int i = 0;
			int result = 1;
			var c = Math.abs(b);
			for (i = 0; i < c; i += 1) {
				result = result * a;
			}
			System.out.println(result);
			if (b > 0) {
				System.out.println(result);
			} else {
				System.out.println((float) 1 / result);
			}
		}

		}
	}

}
