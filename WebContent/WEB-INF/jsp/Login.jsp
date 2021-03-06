<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="static/css/loginForm.css">
</head>
<body onload='document.f.username.focus();'>
	<h3>Login to continue</h3>
	<form class="loginForm" name='f' action='${ pageContext.request.contextPath}/login' method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<input name="${ _csrf.parameterName }"  value="${ _csrf.token }" type="hidden" />
		</table>
	</form>
	
	<c:if test="${ param.error != null }">
	<p class="error"><fmt:message key='Login.error'/></p>
	</c:if>
</body>
</html>