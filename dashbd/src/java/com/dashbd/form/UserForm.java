/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dashbd.form;

/**
 *
 * @author I301095
 */
import org.apache.struts.action.ActionForm;
public class UserForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	// 封装属性
	private String username;
	private String password;

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
