<%@page import="mysqlConnection.RestaurantDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="mysqlConnection.RestaurantDAO,java.util.ArrayList, mysqlConnection.RestaurantDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<RestaurantDTO> re = RestaurantDAO.getList();%>
<div><% 
for(RestaurantDTO res:re){
	%>
	<img src=<%= res.getRes_img() %>>
	<h3><%= res.getRes_name() %></h3>
	<h3><%= res.getAddress() %></h3>
	<h3><%= res.getLocation() %></h3>
	<h3><%=res.getOpen_time() %></h3>
<%
}
%>	
</div>
</body>
</html>