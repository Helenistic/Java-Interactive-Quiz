package com.helen.quiz.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.helen.quiz.broker.QuizBroker;
import com.helen.quiz.domain.Name;
import com.helen.quiz.domain.Quiz;
import com.helen.quiz.domain.QuizResultForm;

@Controller
@RequestMapping("/")
public class QuizController {

	private static final Logger logger = Logger.getLogger(QuizController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "How Much Do You Know About Java?");
		logger.info("in sayHello...");
		model.addAttribute("name", new Name());
		return "welcome";
	}

	/*
	 * @RequestMapping(value = "/name", method = RequestMethod.GET) public
	 * ModelAndView showUserForm() { return new ModelAndView("name", new
	 * Name()); }
	 * 
	 * @RequestMapping(value = "/addName", method = RequestMethod.GET) public
	 * String submit(@ModelAttribute("name")Name name, BindingResult result,
	 * ModelMap model) { if (result.hasErrors()) { return "error"; }
	 * model.addAttribute("firstName", name.getFirstName()); return "welcome"; }
	 */
	@RequestMapping(value = "/nextQuiz", method = RequestMethod.POST)
	public ModelAndView gotoQuiz(@ModelAttribute("name") Name yourName, BindingResult result) {
		/*
		 * 
		 * List<String> majors = getList(); List<String> questions =
		 * getquestions(); String YourName=name.getFirstName();
		 * 
		 * // return back to nextquiz.jsp ModelAndView model = new
		 * ModelAndView("nextquiz"); model.addObject("lists", As1);
		 * model.addObject ("Question1",Question1); model.addObject ("A2",A2);
		 * model.addObject ("YourName", YourName);
		 */
		// String urName=name.getFirstName();

		// List <Quiz> quizList= quizList.getQues();
		// return back to nextquiz.jsp
		ModelAndView model = new ModelAndView("nextquiz");
		model.addObject("YourName", yourName.getFirstName());

		QuizBroker quizBroker = new QuizBroker();
		model.addObject("List", quizBroker.getQuiz());

		model.addObject("quizReturn", new QuizResultForm());

		return model;
	}
	/*
	 * Quiz Q1=new Quiz(); public void YourName (String[] args) {
	 * Q1.setQuestion("Hello"); List<String> Answers1 = new ArrayList<String>();
	 * Answers1.add("Choice1"); Answers1.add("Choice2");
	 * Q1.setAnswers(Answers1); }
	 */

	@RequestMapping(value = "/results", method = RequestMethod.POST)
	public ModelAndView gotoResults(@ModelAttribute("quizReturn") QuizResultForm resultForm, BindingResult result) {

		int right=0;

		List<Quiz> quizList = resultForm.getQuizResultList();
//		for (int i = 0; i < quizList.size(); i++) {
//			Quiz quiz = quizList.get(i);
		for (Quiz quiz : quizList) {
			String correct = quiz.getRightAnswer();
			String chosen = quiz.getSelectedAnswer();

			if (correct.equals(chosen)) {
				right++;
			}
		}
	
		ModelAndView model = new ModelAndView("results");
		
		//Calculating the score and whether or not player passed
		int total = quizList.size();
		int percent = right * 100 / total;
		if (percent >= 60) {
			model.addObject("Passed", "You passed!");
		} else {
			model.addObject("Passed", "You failed");

		}

		if (right<8){
			model.addObject("Advice", 
			"You're a beginner! You should start by learning the basics of Java."
			+ "Try reading the book 'HeadFirst Java' or an online tutorial from Codeacademy.");
		}
		
		else{
			model.addObject("Advice", 
			"You definitely know Java, but perhaps not very well."
			+ "You can try online practice problems from Codingbat or Project Euler to strengthen your understanding");
		}
		
		if (right>11){
			model.addObject("Advice", 
			"You're an expert! I recommend you to try some Java projects."
			+ "You can check out Martyr2'S Mega Project Ideas List to get started.");}
		
		
		String percentage=Integer.toString(percent);
		model.addObject("percentage", percentage);
		
		return model;
	}
}
