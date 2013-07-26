package com.zhaiyz.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="users")
public class UserList {

	private List<User> 	userList;
	
	public UserList() {}
	
    public UserList(List<User> userList) {
        this.userList = userList;
    }

	@XmlElement(name="user")
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
