package com.oak.dto;


public class Question_Options {

	private String qsn_Name;
	private String option;
	
	
	public Question_Options(String qsn_Name, String option) {
		super();
		this.qsn_Name = qsn_Name;
		this.option = option;
		
	}
	
	public Question_Options() {
		
	}

	public String getQsn_Name() {
		return qsn_Name;
	}
	public void setQsn_Name(String qsn_Name) {
		this.qsn_Name = qsn_Name;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	
	
	
	
	
}
