<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Entity1</title>
    
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
  <h1>Update World Body Fat Percentage</h1>
<form action="<c:url value='/WorldBodyFatPercentageServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="update"/>
	body_fat_percentage    :<input type="text" name="Body fat percentage" value="${form.body_fat_percentage }"/>
	<span style="color: red; font-weight: 900">${errors.body_fat_percentage }</span> <br />
	
	country    :<input type="text" name="Country" value="${form.country }"/>
	<span style="color: red; font-weight: 900">${errors.country }</span> <br />
	
	continent    :<input type="text" name="Continent" value="${form.continent }"/>
	<span style="color: red; font-weight: 900">${errors.continent }</span> <br />
	<br/>
	<input type="submit" value="update"/>
</form>
  </body>
</html>
