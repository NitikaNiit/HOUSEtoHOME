package igt.Math;

import igt.Message.MessageImpl;

public class MathFunctionImpl implements MathFunction {

	int i;
	double val;

	MessageImpl msg = new MessageImpl();

	@Override
	public void add(int[] arr) {
		for (i = 0; i < arr.length; i++) {
			val += arr[i];
		}
		System.out.println("Result:" + val);
		msg.successMessage();
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println("Result:" + (num2 - num1));
		msg.successMessage();
	}

	@Override
	public void mul(int num1, int num2) {
		System.out.println("Result:" + (num1 * num2));
		msg.successMessage();
	}

	@Override
	public void div(int num1, int num2) {

		try {
			val = num1 / num2;
			msg.successMessage();
		} catch (Exception e) {
			msg.errorMessage();
		}
	}

}
