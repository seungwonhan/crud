package VO;

import java.sql.Timestamp;

public class BoardVO {
	
	private int num;
	private String title;
	private String writer;
	private Timestamp reg_date;
	private String readcount;
	private String content;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int num, String title, String writer, String readcount, String content) {
		
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.readcount = readcount;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getReg_date() {
		return reg_date;
	}

	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	public String getReadcount() {
		return readcount;
	}

	public void setReadcount(String readcount) {
		this.readcount = readcount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
	
	
	