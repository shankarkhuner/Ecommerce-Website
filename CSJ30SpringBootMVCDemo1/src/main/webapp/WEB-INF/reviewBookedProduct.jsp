<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="sky blue">Hello</font>&nbsp&nbsp&nbsp
<font color="orange">${userInfoKey.customerName}</font><br>
<font color="black">phone number:</font><font color=orange">${userInfoKey.phoneNumber}</font>
<font color="black">Email Id:</font><font color=orange">${userInfoKey.emailId}</font><br>
<font color="black">city:</font><font color=orange">${userInfoKey.address.city}</font><br>
<font color="blue">product name</font>&nbsp&nbsp&nbsp<font color="green">${bookedProductKey.productName}</font>
<font color="blue">product mfd</font>&nbsp&nbsp&nbsp<font color="green">${bookedProductKey.productMfd}</font>
<a href="/finalBook/${bookedProductKey.productId}/${userInfoKey.customerId}">Place Order</a>
</body>
</html>