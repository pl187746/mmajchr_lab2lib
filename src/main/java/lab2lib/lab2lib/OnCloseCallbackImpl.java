package lab2lib.lab2lib;

public class OnCloseCallbackImpl implements OnCloseCallback {
	
	private SimpleUserInterface ui;
	
	public OnCloseCallbackImpl(SimpleUserInterface ui) {
		this.ui = ui;
	}

	@Override
	public boolean closing() {
		return ui.promptYesNo("Czy na pewno chcesz zamknac aplikacje?");
	}

}
