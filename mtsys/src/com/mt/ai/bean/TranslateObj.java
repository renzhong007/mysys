package com.mt.ai.bean;


public class TranslateObj {
	private String text;
	private String from;
	private String to;

	public TranslateObj(String text, String from, String to) {
		super();
		this.text = text;
		this.from = from;
		this.to = to;
	}

	public TranslateObj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
