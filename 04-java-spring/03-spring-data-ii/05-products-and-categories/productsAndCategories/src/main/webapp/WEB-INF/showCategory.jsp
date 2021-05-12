<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Category</title>
</head>
<body>
<div class="container">
<h2>Categories:</h2>
<hr>
<p>${category.name}</p>

<hr>
<h2>Add Category</h2>
<ol>
<c:forEach items="${categories.name }" var="name">
<li>${category.name}</li>
</c:forEach>
</ol>
</div>
</body>
</html>