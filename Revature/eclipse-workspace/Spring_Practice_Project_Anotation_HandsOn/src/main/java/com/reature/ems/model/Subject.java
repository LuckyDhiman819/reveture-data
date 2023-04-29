package com.reature.ems.model;

import org.springframework.stereotype.Component;

@Component("subject")
public class Subject {
	
	private String caption;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String caption) {
		super();
		this.caption = caption;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Override
	public String toString() {
		return "Subject [caption=" + caption + "]";
	}
	

}
