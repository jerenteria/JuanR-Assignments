<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div class="container">
<h1>Welcome</h1>
<h4>Login</h4>
<form method="POST" action="/login">
<div class="form-group">
<label>Email</label>
<input class="form-control" type="email" name="loginEmail">
</div>
<div class="form-group">
<label>Password</label>
<input class="form-control" type="password" name="loginPass">
</div>
<button class="btn btn-standard">Login</button>
</form>
</div>
<div class="col">
		<h2>Register</h2>
		<form:form action="/register" method="POST" modelAttribute="user">
			<div class="form-group">
				<form:label path="firstName">First Name</form:label>
				<form:errors path="firstName"/>
				<form:input class="form-control" path="firstName"/>
			</div>
			<div class="form-group">
				<form:label path="lastName">last Name</form:label>
				<form:errors path="lastName"/>
				<form:input class="form-control" path="lastName"/>
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:errors path="email"/>
				<form:input class="form-control" path="email"/>
			</div>
			<div class="form-group">
				<form:label path="location">location</form:label>
				<form:errors path="location"/>
				<form:input type="form-control" path="location"/>
			</div>
			<div class="form-group">
				<form:label path="password">Password</form:label>
				<form:errors path="password"/>
				<form:input type="password" path="password"/>
			</div>
			<div class="form-group">
				<form:label path="confirmPassword">Confirm Password</form:label>
				<form:errors path="confirmPassword"/>
				<form:input type="password" path="confirmPassword"/>
			</div>
			<input class="btn btn-danger" type="submit" value="submit">
		</form:form>
</div>
</head>
</body>
</html>