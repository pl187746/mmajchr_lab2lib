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
		if(result == null || result.isSuccess()) {
			return null;
		}
		while(true) {
			System.out.print("Czy chcesz zapisac plik pod inna nazwa? [T/N] ");
			String c = scanner.nextLine();
			if(c.startsWith("T") || c.startsWith("t")) {
				System.out.println("Poprzednie ustawienia: ");
				System.out.println("Nazwa pliku: " + result.getFileName());
				System.out.println("String powodzenia: " + result.getCorrectMsg());
				System.out.println("String niepowodzenia: " + result.getIncorrectMsg());
				System.out.print("Nowa nazwa pliku: ");
				String newFileName = scanner.nextLine();
				return newFileName;
			} else if(c.startsWith("N") || c.startsWith("n")) {
				return null;
			}
		}
	}

}
