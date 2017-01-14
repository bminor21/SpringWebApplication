<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Games List</title>
<link rel="stylesheet" type="text/css" href="static/css/main.css">
</head>
<body>
	<table class="gameList">
		<tr>
			<th>Title</th>
			<th>Developer</th>
			<th>Platform</th>
		</tr>
		<c:forEach var="game" items="${games}">
			<tr>
				<td><c:out value="${game.title}"></c:out></td>
				<td><c:out value="${game.developer}"></c:out></td>
				<td><c:out value="${game.platform}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>