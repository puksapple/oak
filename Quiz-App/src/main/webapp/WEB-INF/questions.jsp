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
<form:form modelAttribute="questions" action="save">
question<form:input path="qsn_Name"></form:input><br>
option1:<form:input path="options[0].name"></form:input><br>
option2:<form:input path="options[1].name"></form:input><br>
option3:<form:input path="options[2].name"></form:input><br>
option4:<form:input path="options[3].name"></form:input><br>
<br><br>
answer:<form:input path="answer.answer"/><br>
<form:hidden path="counts"></form:hidden><br>

<input type="submit"  value="save">

</form:form>
</body>
</html>