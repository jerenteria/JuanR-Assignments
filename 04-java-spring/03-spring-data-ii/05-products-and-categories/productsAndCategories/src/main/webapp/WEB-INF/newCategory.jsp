<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Category</title>
</head>
<body>
<h1>New Category</h1>
<form:form method="POST" action="/categories/addCategory" modelAttribute="category">
<div class="form-group">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</div>
	<button>Create</button>
</form:form>
</body>
</html>