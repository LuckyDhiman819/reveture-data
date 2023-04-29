package com.reature.ems.model;

public class Email {
	
	private String to;
	private String from;
	private String subject;
	private String body;
	
	
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Email(String to, String from, String subject, String body) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		from = from;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	@Override
	public String toString() {
		return "Email [to=" + to + ", From=" + from + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
	
	
	
	
}
