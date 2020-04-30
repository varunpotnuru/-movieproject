package com.cg.exception;

public class AdminException extends Exception {
	String msg;

	public AdminException(String msg) {
		super();
		this.msg = msg;
	}
	

}
