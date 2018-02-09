package igt.Main;

import java.util.Scanner;

import igt.Array.ArrayManipulation;
import igt.Array.ArrayManipulationImpl;
import igt.Math.MathFunction;
import igt.Math.MathFunctionImpl;
import igt.Message.MessageImpl;
import igt.String.StringManipulation;
import igt.String.StringManipulationImpl;

public class Task {

	public static void main(String args[]) {
		int op, i, num, num1, num2;
		String name;
		MessageImpl msg = new MessageImpl();
		MathFunction func = new MathFunctionImpl();
		StringManipulation strm = new StringManipulationImpl();
		ArrayManipulation arrm = new ArrayManipulationImpl();

		msg.consoleAppDriven();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one" + "\n" + "1. MathFunction" + "\n" + "2. String Manipulation" + "\n"
				+ "3. Array Manipulation");
		op = sc.nextInt();
		msg.clearScreen();

		switch (op) {
		case 1:
			msg.chooseOption();
			System.out.println("1. Addition" + "\n" + "2.Subtraction" + "\n" + "3. Multiplication" + "\n"
					+ "4. Division" + "\n" + "0 back to main menu");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Option Under Construction");
				break;

			case 1:
				System.out.println("How many numbers you want to add?");
				num = sc.nextInt();
				msg.enterNumber();
				int arr[] = new int[num];
				for (i = 0; i < num; i++) {
					arr[i] = sc.nextInt();
				}
				func.add(arr);
				break;

			case 2:
				msg.enterNumber();
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				func.sub(num1, num2);
				break;

			case 3:
				msg.enterNumber();
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				func.mul(num1, num2);
				break;

			case 4:
				msg.enterNumber();
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				func.div(num1, num2);
				break;

			default:
				System.out.println("Please enter valid option!");
			}

			break;

		case 2:
			msg.chooseOption();
			System.out.println("1. Reverse a String" + "\n" + "2. Extract Characters from a String" + "\n"
					+ "0 back to main menu");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Option Under Construction");
				break;

			case 1:
				System.out.println("Enter your first name");
				name = sc.next();
				strm.reverseString(name);
				;
				break;

			case 2:
				System.out.println("Enter any String to extract characters");
				name = sc.next();
				strm.extractChar(name);
				break;

			default:
				System.out.println("Please enter valid option!");
			}

			break;

		case 3:
			msg.chooseOption();
			System.out.println("1. Array Sorting" + "\n" + "2. Concatenate string array elements" + "\n"
					+ "3. Concatenate character array elements" + "\n" + "4. Sum of integer array elements" + "\n"
					+ "0 back to main menu");
			op = sc.nextInt();

			switch (op) {
			case 0:
				System.out.println("Option Under Construction");
				break;

			case 1:
				System.out.println("Enter size of array");
				num = sc.nextInt();
				msg.enterNumber();
				int arr[] = new int[num];
				for (i = 0; i < num; i++) {
					arr[i] = sc.nextInt();
				}
				arrm.bubbleSort(arr);
				break;

			case 2:
				System.out.println("Enter your first name & last name");
				String str[] = new String[2];
				for (i = 0; i < 2; i++) {
					str[i] = sc.next();
				}
				arrm.stringArr(str);
				break;

			/*
			 * case 3: System.out.println("Enter size of array"); num =
			 * sc.nextInt(); msg.enterNumber(); char arr1[] = new char[num]; for
			 * (i = 0; i < num; i++) { arr1[i] = sc. } arrm.charArr(arr1);
			 * break;
			 */

			case 4:
				System.out.println("How many numbers you want to add?");
				num = sc.nextInt();
				msg.enterNumber();
				int arr2[] = new int[num];
				for (i = 0; i < num; i++) {
					arr2[i] = sc.nextInt();
				}
				func.add(arr2);
				break;

			default:
				System.out.println("Please enter valid option!");
			}

			break;

		default:
			System.out.println("Please enter valid option!");
		}

	}

}
