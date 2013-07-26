package com.zhaiyz.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="strings")
public class StringBean {

	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
