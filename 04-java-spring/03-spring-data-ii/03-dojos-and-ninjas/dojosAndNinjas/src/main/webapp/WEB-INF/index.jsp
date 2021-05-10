<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<form:form method="POST" action="/newDojo" modelAttribute="dojo">
<div class="form-group">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</div>
	<button>Create</button>
</form:form>
</body>
</html>