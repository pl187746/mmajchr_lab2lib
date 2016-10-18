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

	public SaveResult(String fileName, String correctMsg, String incorrectMsg) {
		super();
		this.fileName = fileName;
		this.correctMsg = correctMsg;
		this.incorrectMsg = incorrectMsg;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCorrectMsg() {
		return correctMsg;
	}

	public void setCorrectMsg(String correctMsg) {
		this.correctMsg = correctMsg;
	}

	public String getIncorrectMsg() {
		return incorrectMsg;
	}

	public void setIncorrectMsg(String incorrectMsg) {
		this.incorrectMsg = incorrectMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
