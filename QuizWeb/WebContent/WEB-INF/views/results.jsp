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

<body background="<c:url value="/resources/images/Results.jpg"/>">
<br><br>
<h2 style=font-size:36px;>${Passed}</h2>
<h2>You got ${percentage} %</h2>
<br><br>
<p style="font-family:verdana; text-align:center; font-size:20px;">${Advice}</p>
</body>
</html>