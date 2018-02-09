package igt.Array;

import igt.Message.MessageImpl;

public class ArrayManipulationImpl implements ArrayManipulation {
	double val;
	int i, j;
	String str;

	MessageImpl msg = new MessageImpl();

	@Override
	public void bubbleSort(int[] arr) {
		int temp;
		for (j = arr.length; j > 0; j++) {
			for (i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		msg.successMessage();
	}

	@Override
	public void stringArr(String[] arr) {
		str = arr[0].concat(arr[1]);
		System.out.println(str);
		msg.successMessage();
	}

	@Override
	public void charArr(char[] arr) {
		str = String.valueOf(arr);
		System.out.println(str);
		msg.successMessage();
	}

	@Override
	public void arraySum(int[] arr) {
		for (i = 0; i < arr.length; i++) {
			val += arr[i];
		}
		System.out.println("Result:" + val);
		msg.successMessage();
	}

}
