<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<c:url value="/resources/css/quiz.css" />" rel="stylesheet"></link>
<script src="<c:url value="/resources/js/jquery-1.12.4.min.js" />"></script>
<script src="<c:url value="/resources/js/quiz.js" />"></script>
<title>Quiz Web Application</title>
</head>

<body background="<c:url value="/resources/images/background.jpg" />">
	
	<div id="logo">
		<a href="http://www.google.ca"> <img
			src="<c:url value="/resources/images/logo.png" />" alt="Logo" />
		</a>
	</div>

	<div id="main">
	<h1>${greeting}</h1>
	<br>
	<p class="intro"> Whether you're a beginner, intermediate, or expert, I can give you advice on how to get better</p>
	<p class="intro"> Just enter your name and start the quiz.</p>
	<br>
	<c:url var="gotoUrl" value="/nextQuiz" />
	<form:form method="POST" action="${gotoUrl}" modelAttribute="name">
  <form:label path="firstName">Your First Name</form:label>
  <form:input path="firstName"/>
  <br>
  <br><br>
  <input type="submit" value="Submit"/>
</form:form>
	</div>
</body>
</html>