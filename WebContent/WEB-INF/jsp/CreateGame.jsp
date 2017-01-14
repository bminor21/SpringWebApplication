<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a game</title>
<link rel="stylesheet" type="text/css" href="static/css/main.css">
</head>
<body>

<form class="form" action="${ pageContext.request.contextPath }/docreate" method="POST" >
	Title: <input type="text" name="title"><br>
	Developer: <input type="text" name="developer"><br> 
	Platform:
		<select name="platform">
			<c:forEach var="p" items="${platforms}">
				<option value="${p}">${p}</option>
			</c:forEach>
		</select><br>
	<input type="submit" value="Create Game">
</form>

</body>
</html>