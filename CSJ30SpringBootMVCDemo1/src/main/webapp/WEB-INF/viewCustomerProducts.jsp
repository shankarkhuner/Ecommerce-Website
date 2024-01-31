<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product" %>
     <%@ page import="java.util.*" %>
    <%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.header {
  padding: 2px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 10px;
}

/* Page Content */
.content {padding:10px;}
</style>


</head>
<div class="header">

<h1><font color="blue">Hello!!!!!</font> <font color="orange">${userInfoKey.customerName}
</font>welcome to our website</h1>
 
</div>
<br>


<body>

<% List<Product> list=(List<Product>)request.getAttribute("productsKey");
for(Product p:list)
{
	String filePath=p.getProductImage();
	String[] s=filePath.split("/");
	System.out.println("Hi"+ " "+s[s.length-1]);
	String finalPath="/images/"+s[s.length-1];

%>
<a href="bookProduct/<%=p.getProductId() %>">
<div><img src='<%=finalPath%>'  height="50"  width="50"/><br>
<font color="green"><%=p.getProductName() %></font><br>
<font color="red"><%=p.getProductPrice() %></font><br>
</div>
</a>
<% } %>
</body>
</html>