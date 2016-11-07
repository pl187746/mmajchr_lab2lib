package lab2lib.lab2lib;

public class FirstCallbackImpl implements FirstCallback {
	
	private SimpleUserInterface ui;

	public FirstCallbackImpl(SimpleUserInterface ui) {
		super();
		this.ui = ui;
	}

	public SimpleUserInterface getUi() {
		return ui;
	}

	public void setUi(SimpleUserInterface ui) {
		this.ui = ui;
	}

	@Override
	public String callback(SecondCallback secondCallback) {
		SaveResult result = secondCallback.callback();
		if(result == null || result.isSuccess()) {
			return null;
		}
		while(true) {
			String c = ui.prompt("Czy chcesz zapisac plik pod inna nazwa? [T/N] ");
			if(c.startsWith("T") || c.startsWith("t")) {
				System.out.println("Poprzednie ustawienia: ");
				System.out.println("Nazwa pliku: " + result.getFileName());
				System.out.println("String powodzenia: " + result.getCorrectMsg());
				System.out.println("String niepowodzenia: " + result.getIncorrectMsg());
				System.out.print("Nowa nazwa pliku: ");
				String newFileName = ui.prompt("Nowa nazwa pliku: ");
				return newFileName;
			} else if(c.startsWith("N") || c.startsWith("n")) {
				return null;
			}
		}
	}

}
