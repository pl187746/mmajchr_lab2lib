package lab2lib.lab2lib;

public class SaveResult {
	private String fileName;
	private String correctMsg;
	private String incorrectMsg;
	private boolean success;
	
	public SaveResult() { }

	public SaveResult(String fileName, String correctMsg, String incorrectMsg, boolean success) {
		super();
		this.fileName = fileName;
		this.correctMsg = correctMsg;
		this.incorrectMsg = incorrectMsg;
		this.success = success;
	}
	
}
