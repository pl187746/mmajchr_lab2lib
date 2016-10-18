package lab2lib.lab2lib;

public class SecondCallbackImpl implements SecondCallback {
	
	private SaveResult saveResult;
	
	public SecondCallbackImpl() { }

	@Override
	public SaveResult callback() {
		return saveResult;
	}

}
