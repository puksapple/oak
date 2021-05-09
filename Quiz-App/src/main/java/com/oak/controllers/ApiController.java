package com.oak.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.oak.Repository.ActivitiesCrudRepository;
import com.oak.Repository.OptionRepository;
import com.oak.Repository.QuestionRepository;
import com.oak.Repository.UserRepository;
import com.oak.dto.Activities;
import com.oak.dto.Question;

@Controller

public class ApiController {

	@Autowired
	private QuestionRepository qr;
	@Autowired
	private OptionRepository or;

	@Autowired
	private ActivitiesCrudRepository acr;
	
	@Autowired
	UserRepository repo;

	@RequestMapping("/questions")
	public String ShowQuestions(Model m, Question question) {
		m.addAttribute("questions",question);
		System.out.println(repo.findByName("ram"));
		return "questions";
		
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute("questions") Question question) {
		System.out.println(question.getCounts());
		qr.save(question);
		return "questions";
	}



	@RequestMapping("/pq")
	public String playQuiz(Model m,@ModelAttribute("questions")Question qsn) {
		int i=qsn.getCounts();		
	
	System.out.println(i);
		List<Question> q = qr.findAll();
		
		Question qs = q.get(i);
		System.out.println(qs);
	
		String answer=qs.getAnswer().getAnswer();

		
		m.addAttribute("qs", qs);
		m.addAttribute("answer",answer);
		
		
		return "play-quiz";
	}
	
	@RequestMapping("/result")
	public String result( Model m,Question qsn) {
		
		String result;
		int i=qsn.getCounts();
		System.out.println("choosed    "+qsn.getChoosed());
		System.out.println("answer    "+qsn.getAnswer().getAnswer());
		if((qsn.getAnswer().getAnswer()).equals(qsn.getChoosed())) {
		 result="correct";
		 m.addAttribute("result",result);
		}else {
			result="not correct";
			 m.addAttribute("result",result);
		}
		
		m.addAttribute("indexs",i);
		return "result";
	}
	

	
	@RequestMapping("/nextQuestion")
	public String nextQuestion(@RequestParam("indexs") int i,Model m,@ModelAttribute("questions") Question qsn) {
		
		List<Question> q = qr.findAll();
		Question qs = q.get(i);
		String answer=qs.getAnswer().getAnswer();
		m.addAttribute("answer",answer);	
		m.addAttribute("qs", qs);
	
		m.addAttribute("indexs", i);
		return "play-quiz";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping("/activities")
	public String activities(Model m) {

		Iterable<Activities> activities = acr.findAll();
		m.addAttribute("activities", activities);

		return "activities";
	}

	@RequestMapping("/saveActivities")
	public String Saveactivities(@ModelAttribute("activities") Activities ac) {
		acr.save(ac);
		return ("redirect:activities");
	}

	@RequestMapping("/addActivities")
	public String addActivities(@ModelAttribute("activities") Activities ac) {

		return "addActivities";
	}

}
