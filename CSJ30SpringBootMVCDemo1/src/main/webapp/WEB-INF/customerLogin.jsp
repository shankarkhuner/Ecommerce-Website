<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<body>
<div class="header">
<h1><font color="blue">welcome to our shoping center</font></h1>
 
</div>
<br>
<center>
<table>
<tr>
<form action="customerLogin" method="post">
Enter User Name:<input type="text" name="t1"><br>
Enter password:<input type="password" name="t2"><br>
<input type="submit" value="signin">
</tr>

</table>

</form>
<a href="showSignUpForm">new user???</a>
<a href="forgetPassword">forgot password???</a>
</center>
</body>
</html>