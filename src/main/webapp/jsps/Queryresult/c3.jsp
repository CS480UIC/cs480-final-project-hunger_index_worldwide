<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Query 3 table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>Country</th>
		<th>Continent</th>
		<th>Death Rate</th>
	</tr>
<c:forEach items="${CCList}" var="user">
	<tr>
		<td>${user.country}</td>
		<td>${user.continent}</td>
		<td>${user.death_rate}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>