<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>Welcome ${user.firstName}</h1>
<hr>
<thead>
<td>Name</td>
<td>Date</td>
<td>Location</td>
<td>Host</td>
<td>Action/Status</td>
</thead>
<tbody>
<c:forEach items="${events }" var="event">
<tr>
<td>${event.name}</td>
<td>${event.date}</td>
<td>${event.location}</td>
<td>${host.name}</td>
<td>place holder</td>
</c:forEach>
</tbody>
</body>
</html>