package com.oak.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String qsn_Name;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	List<Options> options;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Answer answer;
	
	private int counts;
	private String choosed;
	

	public String getChoosed() {
		return choosed;
	}

	public void setChoosed(String choosed) {
		this.choosed = choosed;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQsn_Name() {
		return qsn_Name;
	}

	public void setQsn_Name(String qsn_Name) {
		this.qsn_Name = qsn_Name;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}
	


}
