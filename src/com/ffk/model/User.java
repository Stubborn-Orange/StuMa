package com.ffk.model;
/**
 *  ����Ա��
 * @author DY1101shaoyuxian
 *
 */
public class User {
	private int id;//����Աid
	private String username;//�û���
	private String password;//����

	public User() {

	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}