package lab2lib.lab2lib;

public class SecondCallbackImpl implements SecondCallback {
	
	private SaveResult saveResult;
	
	public SecondCallbackImpl() { }

	public SecondCallbackImpl(SaveResult saveResult) {
		super();
		this.saveResult = saveResult;
	}

	public SaveResult getSaveResult() {
		return saveResult;
	}

	public void setSaveResult(SaveResult saveResult) {
		this.saveResult = saveResult;
	}

	@Override
	public SaveResult callback() {
		return saveResult;
	}

}
