<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<c:url value="/resources/css/quiz.css" />" rel="stylesheet"></link>
<script src="<c:url value="/resources/js/jquery-1.12.4.min.js" />"></script>
<script src="<c:url value="/resources/js/quiz.js" />"></script>
<body style="background-color:brown;">
<h1>Please input a value for your name</h1>
<c:url var="gotoUrl" value="/nextQuiz" />
	<form:form method="POST" action="${gotoUrl}" modelAttribute="name">
  <form:label path="firstName">Your First Name</form:label>
  <form:input path="firstName" />
  <br>
  <br><br>
  <input type="submit" value="Submit"/>
</form:form>
</body>
</html>