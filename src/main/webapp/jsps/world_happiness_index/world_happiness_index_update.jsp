<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update World Happiness Index</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Update World Happiness Index</h1>
<form action="<c:url value='/WorldHappinessIndexServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="update"/>
	Happiness Index    :<input type="text" name="Happiness Index" value="${form.happiness_index }"/>
	<span style="color: red; font-weight: 900">${errors.happiness_index }</span> <br />
	
	Country    :<input type="text" name="Country" value="${form.country }"/>
	<span style="color: red; font-weight: 900">${errors.country }</span> <br />
	
	Continent    :<input type="text" name="Continent" value="${form.continent }"/>
	<span style="color: red; font-weight: 900">${errors.continent }</span> <br />
	
	<input type="submit" value="Update Entry"/>
</form>
  </body>
</html>
