<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="static/css/main.css">
</head>
<body onload='document.f.username.focus();'>
	<h3>Login with Username and Password</h3>
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
			<input name="_csrf" type="hidden" value="480eae9d-4fc6-42f7-b3c5-0cb16b2f0d2f" />
		</table>
	</form>
</body>
</html>