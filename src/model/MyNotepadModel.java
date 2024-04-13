package model;

public class MyNotepadModel {
	private String file_name;
	private String content;
	public MyNotepadModel() {
		this.file_name = "";
		this.content = "";
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
