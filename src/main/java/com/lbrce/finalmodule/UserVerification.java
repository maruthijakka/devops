package com.lbrce.finalmodule;

import java.util.ResourceBundle;

public class UserVerification {
	public boolean check(String uname,String pswd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("configure");
		String user=rb.getString("username");
		String pass=rb.getString("password");
		if(uname.equals(user)&& pswd.equals(pass))
				return true;
		else
			return false;
	}
}
