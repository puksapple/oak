<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	"http://java.sun.com/dtd/web-app_2_3.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<form:form action="result" modelAttribute="questions">
${qs.qsn_Name}<br>

<c:forEach var="temp" items="${qs.options}">
<form:radiobutton value="${temp.name}" path="choosed"></form:radiobutton> ${temp.name}


</c:forEach>

<form:hidden path="counts" value="${indexs+1}"/>
<form:input path="answer.answer" value="${answer}"/>
<br>
<input type="submit" value="send"><br>

</form:form>
<a href="nextQuestion?indexs=${indexs+1}" >skip</a>
</body>
</html>