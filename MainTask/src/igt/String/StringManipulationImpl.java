package igt.String;

public class StringManipulationImpl implements StringManipulation {

	char[] arr;
	int i;

	@Override
	public void reverseString(String name) {
		arr = name.toCharArray();
		for (i = arr.length - 1; i >= 0; i--) {
			System.out.print(" " + arr[i]);
		}
	}

	@Override
	public void extractChar(String name) {
		arr = name.toCharArray();
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
