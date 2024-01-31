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
</head>
<body>
<center>
<table border="2" cellspaing="5" cellpadding="5">
<thead>
<th background="green">ID</th>
<th background="green">Name</th>
<th background="green">Price</th>
<th background="green">Date</th>
<th background="green">image</th>
<th background="green">EDIT</th>
<th background="green">DELETE</th>
</thead>


<%  List<Product> list=(List<Product>)request.getAttribute("products");
for(Product p:list)
{
	String filePath=p.getProductImage();
	String[] s=filePath.split("/");
	System.out.println("Hi"+ " "+s[s.length-1]);
	String finalPath="/images/"+s[s.length-1];

%>
<tr>

<td bgcolor="red" align="center"><%=p.getProductId() %></td>
<td bgcolor="orange" align="center"><%=p.getProductName() %></td>
<td bgcolor="pink" align="center"><%=p.getProductPrice() %></td>
<td bgcolor="white" align="center"><%=p.getProductMfd() %></td>
<td bgcolor="sky blue" align="center"><img src='<%=finalPath%>'  height="50"  width="50"/></td>
<td bgcolor="green" align="center"><a href="editProduct/<%=p.getProductId()%>"><img src="images/editb.png" height="20" width="20"></a></td>
<td bgcolor="black" align="center"><a href="deleteProduct/<%=p.getProductId()%>"><img src="images/deleteb.png" height="20" width="20"></a></td>
</tr>
<%} %>
</table>


</center>
<a href=""></a>
</body>
</html>