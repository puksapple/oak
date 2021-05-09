<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
     <!DOCTYPE web-app PUBLIC
	"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	"http://java.sun.com/dtd/web-app_2_3.dtd">

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="/questions" modelAttribute="option">
option1:<form:input path="op1"></form:input><br>
option2:<form:input path="op2"></form:input><br>
option3:<form:input path="op3"></form:input><br>
option4:<form:input path="op4"></form:input><br>

<input type="submit" value="send"/>


</form:form>
</body>
</html>