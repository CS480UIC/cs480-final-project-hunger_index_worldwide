<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>Queries</h1>
    <br>
    <a href="<c:url value='/WorldBodyFatPercentageQ1'/>" target="body">Q1-: List Countries and Continents with Body Fat Percentage more than 5.0</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/WorldDeathRateQ2'/>" target="body">Q2-: List Countries and Continents with Death Rate more than 12.0</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/WorldHappinessIndexQ3'/>" target="body">Q3-: List Countries and Continents with Happiness Index more than 7.0</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/WorldBodyFatPercentageC2'/>" target="body">Complex Q3-: List Countries, Continents and Body Fat Percentage where the Body Fat Percentage is more than the average Body Fat Percentage of the table</a>&nbsp;&nbsp;
    <br>
    <a href="<c:url value='/WorldDeathRateC3'/>" target="body">Complex Q3-: List Countries, Continents and Death Rate where the Body Fat Percentage is more than 5.0</a>&nbsp;&nbsp;
 	<br>
  </body>
</html>