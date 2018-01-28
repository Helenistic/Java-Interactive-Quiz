<%@ page contentType="text/html; charset = UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<c:url value="/resources/css/quiz.css" />" rel="stylesheet"></link>
<script src="<c:url value="/resources/js/jquery-1.12.4.min.js" />"></script>
<script src="<c:url value="/resources/js/quiz.js" />"></script>
<title>Quiz Web Application</title>
</head>

<c:if test="${empty param.firstName}">
	<jsp:forward page="Handle.jsp" />
</c:if>
<body background="<c:url value="/resources/images/background.jpg" />">

<div id="div">
<div id="divWelcome">
<p class="next">Hello ${YourName}, welcome.</p>
<p class="next">Good luck!</p>
</div>
<c:url var="gotoUrl" value="/results" />
<form:form method="POST" action="${gotoUrl}" modelAttribute="quizReturn">

	<c:if test="${not empty List}">
		<ol>
			<c:forEach var="quiz" items="${List}" varStatus="loopStatus">
			<br>
				<li>${quiz.question}</li>
				<br>

				<form:hidden path="quizResultList[${loopStatus.index}].question"
					value="${quiz.question}" />
				<form:hidden path="quizResultList[${loopStatus.index}].rightAnswer"
					value="${quiz.rightAnswer}" />				
				<form:radiobuttons
					path="quizResultList[${loopStatus.index}].selectedAnswer"			
					items="${quiz.answers}" 
					/> 	
					<br>
			</c:forEach>
		</ol>
	</c:if>

	<input type="submit" value="Next" />
	
	
</form:form>
	</div>
</body>
</html>