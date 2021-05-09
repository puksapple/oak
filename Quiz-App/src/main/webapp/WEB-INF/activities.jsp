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
<style>
#activities{
		border-radius: 5px;
	}
	#activities_container{
		padding: 5px;
		max-height: 400px;
		border: 1px solid white;
		overflow: auto;
	}
	#activities #activities_list{
		margin:5px;
		border-radius: 5px;
		text-align: justify;
		padding: 5px;
		border: 1px solid gray;
	}
	#activities #activities_list:hover{
			background: lightblue;
	}
			#activities #activities_list h4{
				border-bottom: 1px solid black;
			}
			#activities #activities_list ._seemore{
				text-decoration: underline;
				}
			#activities #activities_list ._seemore:hover{
				font-weight: bold;
				cursor: pointer;
			}
</style>
</head>
<body>

<main>
 <div class="container-fluid">
    <div class="row">
      <div class="col-sm-9" id="slide_container">
		<h2>  </h2>
		
      </div>
	  <div class="col-sm-3" id="activities">
	  <span id="activities_h4">Other Activities</span>
	  <c:forEach var="temp" items="${activities}">
		<div id="activities_container">
			<div id="activities_list">
			
			<h4>${temp.heading }</h4>
			
			${temp.content }
			<span class="_seemore" onclick="">See more</span>
			</div>
		
			
					
		</div>
		</c:forEach>
	  </div>
    </div>
  </div>
  </div>
</main>
</body>
</html>