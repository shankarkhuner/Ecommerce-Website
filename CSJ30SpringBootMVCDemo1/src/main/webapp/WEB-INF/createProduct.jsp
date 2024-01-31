<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addProduct" method="post">
Enter ID:<input type="text" name="productId"><br>
Enter Name:<input type="text" name="productName"><br>
Enter Date:<input type="date" name="productMfd"><br>
Enter Price:<input type="text" name="productPrice"><br>
Enter image url here:<textarea rows="10" cols="10" name="productImage"></textarea><br>
<input type="submit" value="addProduct">








</form>
</body>
</html>