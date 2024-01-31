<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=(String) request.getAttribute("adminKey"); %>
<h4><font color="blue"> Welcome <%=name %></font></h4>
<a href="createProduct">ADD PRODUCT</a><br>
<a href="viewAllProduct">View Product</a>
</body>
</html>