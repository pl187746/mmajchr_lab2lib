package lab2lib.lab2lib;

import java.util.Scanner;


public class FirstCallbackImpl implements FirstCallback {
	
	private Scanner scanner;

	public FirstCallbackImpl(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	@Override
	public String callback(SecondCallback callback) {
		SaveResult result = callback.callback();
		if(result == null || result.isSuccess())
			return null;
		while(true) {
			return null;
		}
	}

}
