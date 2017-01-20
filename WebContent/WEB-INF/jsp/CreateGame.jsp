<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create a game</title>
<link rel="stylesheet" type="text/css" href="static/css/main.css">
</head>
<body>

<sf:form class="form" action="${ pageContext.request.contextPath }/docreate" method="POST" commandName="game" >
<table>
	<tr><td>Title:</td><td><sf:input type="text" name="title" path="title"/><sf:errors path="title" cssClass="error" /></td></tr>
	<tr><td>Developer:</td><td><sf:input type="text" name="developer" path="developer" /><sf:errors path="developer" cssClass="error" /></td></tr>
	<tr><td>Price:</td><td>$<sf:input type="text" name="price" path="price"/><sf:errors path="price" cssClass="error" /></td></tr>
	<tr><td>Platform:</td><td>
		<sf:select name="platform" path="platform" >
			<c:forEach var="p" items="${platforms}">
				<option value="${p}">${p}</option>
			</c:forEach>
		</sf:select><sf:errors path="platform" cssClass="error" /></td></tr>
	<tr><td><input type="submit" value="Create Game"></td></tr>
	</table>
</sf:form>



</body>
</html>