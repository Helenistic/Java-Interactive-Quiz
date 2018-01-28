package com.helen.quiz.broker;

import java.util.ArrayList;
import java.util.List;

import com.helen.quiz.domain.Quiz;

public class QuizBroker {
	
	public List<Quiz> getQuiz() {
		List<Quiz> quizList = new ArrayList<Quiz>();
		
		// Setting each question, the options, and the correct answers
		Quiz Q1 = new Quiz();
		Q1.setQuestion("Let's start of easy, what does Java stand for?");
		List<String> Answers1 = new ArrayList<String>();
		Answers1.add("Just Another Vague Acronym");
		Answers1.add("Coffee");
		Answers1.add("It's not an acronyme");
		Answers1.add("Joint Academic Virtual Application");
		Q1.setAnswers(Answers1);
		Q1.setRightAnswer(Answers1.get(2));
		
		Quiz Q2 = new Quiz();
		Q2.setQuestion("Which variable is defined within a class "
				+ "but outside of a method?");
		List<String> Answers2 = new ArrayList<String>();
		Answers2.add("Instance variables");
		Answers2.add("Local variables");
		Answers2.add("Primitive variables");
		Answers2.add("Final variables");
		Q2.setAnswers(Answers2);
		Q2.setRightAnswer(Answers2.get(0));
		
		Quiz Q3 = new Quiz();
		Q3.setQuestion("Which symbol is needed at the end of most java lines?");
		List<String> Answers3 = new ArrayList<String>();
		Answers3.add(":");
		Answers3.add(";");
		Answers3.add("{");
		Answers3.add("}");
		Q3.setAnswers(Answers3);
		Q3.setRightAnswer(Answers3.get(1));
		
		
		Quiz Q4 = new Quiz();
		Q4.setQuestion("What must you always name the method that"
				+ " runs first in the program?");
		List<String> Answers4 = new ArrayList<String>();
		Answers4.add("prime");
		Answers4.add("main");
		Answers4.add("first");
		Answers4.add("primary");
		Q4.setAnswers(Answers4);
		Q4.setRightAnswer(Answers4.get(1));
		
		Quiz Q5 = new Quiz();
		Q5.setQuestion("What do you use to initialize a loop?");
		List<String> Answers5 = new ArrayList<String>();
		Answers5.add("for");
		Answers5.add("while");
		Answers5.add("do...while");
		Answers5.add("All of the above");
		Q5.setAnswers(Answers5);
		Q5.setRightAnswer(Answers5.get(3));
		
		
		
		Quiz Q6 = new Quiz();
		Q6.setQuestion("To compare if String1 and String2 are the "
				+ "same, which syntax is correct?");
		List<String> Answers6 = new ArrayList<String>();
		Answers6.add("If ((String1=String2)==true)");
		Answers6.add("If (String1==String2)");
		Answers6.add("If (String1.equals(String2))");
		Answers6.add("If (String1.equals(String2))==true");
		Q6.setAnswers(Answers6);
		Q6.setRightAnswer(Answers6.get(2));
		
		Quiz Q7 = new Quiz();
		Q7.setQuestion("To use a Java package other than java.lang, "
				+ "what must you do?");
		List<String> Answers7 = new ArrayList<String>();
		Answers7.add("Import the package before your code");
		Answers7.add("Type the package name the first time you use it");
		Answers7.add("Type the package name the every time you use it");
		Answers7.add("Choices 1 and 2 are both correct");
		Answers7.add("Choices 1 and 3 are both correct");
		Answers7.add("Choices 3 and 2 are both correct");
		Q7.setAnswers(Answers7);
		Q7.setRightAnswer(Answers7.get(4));
		
		Quiz Q8 = new Quiz();
		Q8.setQuestion("What are some rules to overriding a method?");
		List<String> Answers8 = new ArrayList<String>();
		Answers8.add("Methods must have the same names and return types must be the same");
		Answers8.add("Methods must have different names and return types must be different");
		Answers8.add("Methods must have the same names and return types must be the same");
		Answers8.add("Methods must have different names and return types must be different");
		Q8.setAnswers(Answers8);
		Q8.setRightAnswer(Answers8.get(0));
		
		Quiz Q9 = new Quiz();
		Q9.setQuestion("What is polymorphism?");
		List<String> Answers9 = new ArrayList<String>();
		Answers9.add("Something that stems from the power of multi inheritence");
		Answers9.add("When you turn an interface into a superclass");
		Answers9.add("A variable is polymorphism if it is declared within a method");
		Answers9.add("Methods that can return any value type");
		Q9.setAnswers(Answers9);
		Q9.setRightAnswer(Answers9.get(0));
		
		Quiz Q10 = new Quiz();
		Q10.setQuestion("Subclasses______ superclasses and they _________ interfaces.");
		List<String> Answers10 = new ArrayList<String>();
		Answers10.add("extends, extends");
		Answers10.add("implements, inherits");
		Answers10.add("extends, inherits");
		Answers10.add("extends, implements");
		Q10.setAnswers(Answers10);
		Q10.setRightAnswer(Answers10.get(3));
		
		Quiz Q11 = new Quiz();
		Q11.setQuestion("Given that Dog extends Animal, an abstract superclass, which declaration below is illegal?");
		List<String> Answers11 = new ArrayList<String>();
		Answers11.add("Dog newdog=new dog()");
		Answers11.add("Animal newdog=new dog()");
		Answers11.add("Dog newdog=new animal()");
		Q11.setAnswers(Answers11);
		Q11.setRightAnswer(Answers11.get(2));
		
		Quiz Q12 = new Quiz();
		Q12.setQuestion("Which statement is false about a constructor?");
		List<String> Answers12 = new ArrayList<String>();
		Answers12.add("It runs when a new instance of a class is made");
		Answers12.add("It can call the constructor of a superclass");
		Answers12.add("You must write your own constructors, they are not there by default");
		Answers12.add("Constructors look similar to methods, however, they do not have a return value");
		Q12.setAnswers(Answers12);
		Q12.setRightAnswer(Answers12.get(2));
		
		Quiz Q13 = new Quiz();
		Q13.setQuestion("When programming to do something risky, what set of methods should you use?");
		List<String> Answers13 = new ArrayList<String>();
		Answers13.add("Exception{} and catch{}");
		Answers13.add("try{} and catch{}");
		Answers13.add("tryexception{} and catchexception{}");
		Answers13.add("throwexception{} and catch{}");
		Q13.setAnswers(Answers13);
		Q13.setRightAnswer(Answers13.get(1));
		
		Quiz Q14 = new Quiz();
		Q14.setQuestion("Let's start of easy, what does Java stand for?");
		List<String> Answers14 = new ArrayList<String>();
		Answers14.add("Just Another Vague Acronym");
		Answers14.add("Coffee");
		Answers14.add("It's not an acronyme");
		Answers14.add("Joint Academic Virtual Application");
		Q14.setAnswers(Answers14);
		Q14.setRightAnswer(Answers14.get(2));
		
		Quiz Q15 = new Quiz();
		Q15.setQuestion("Finally, what can you use to combine java data to "
				+ "the front end in an HTML file?");
		List<String> Answers15 = new ArrayList<String>();
		Answers15.add("JSP");
		Answers15.add("Swift");
		Answers15.add("C++");
		Answers15.add("HTML5");
		Q15.setAnswers(Answers15);
		Q15.setRightAnswer(Answers15.get(0));
		
		// Adding each set of questions and answers to quizList
		quizList.add(Q1);
		quizList.add(Q2);
		quizList.add(Q3);
		quizList.add(Q4);
		quizList.add(Q5);
		quizList.add(Q6);
		quizList.add(Q7);
		quizList.add(Q8);
		quizList.add(Q9);
		quizList.add(Q10);
		quizList.add(Q11);
		quizList.add(Q12);
		quizList.add(Q13);
		quizList.add(Q14);
		quizList.add(Q15);

		return quizList;
	}

	public static void main(String[] args) {
		QuizBroker testingit = new QuizBroker();
		for (Quiz quiz : testingit.getQuiz()) {
			System.out.print(quiz.getQuestion());
			System.out.print(quiz.getAnswers());
		}

	}
}
