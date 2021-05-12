<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new product</title>
</head>
<body>
<h1>New Product</h1>
<form:form method="POST" action="/products/addProduct" modelAttribute="product">
<div class="form-group">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</div>
	<div class="form-group">
	<form:label path="description">Description</form:label>
	<form:errors path="description"/>
	<form:input path="description"/>
	</div>
	<div class="form-group">
	<form:label path="price">Price</form:label>
	<form:errors path="price"/>
	<form:input path="price"/>
	</div>
	<button>Create</button>
</form:form>
</body>
</html>