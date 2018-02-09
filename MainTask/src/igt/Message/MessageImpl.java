package igt.Message;

import java.util.Scanner;

public class MessageImpl {

	public void successMessage() {
		System.out.println("Operation Successful!");
	}

	public void errorMessage() {
		System.out.println("Operation Failed!");
	}

	public void consoleAppDriven() {
		System.out.println("Welcome to MainTask!");
	}

	public void chooseOption() {
		System.out.println("Choose one");
	}

	public void clearScreen() {
		for (int i = 0; i < 5; i++) {
			System.out.println("----*----*-----*-----*-----*-----*-----*-----*");
		}

	}

	public void enterNumber() {
		System.out.println("Enter the numbers");
	}

}
