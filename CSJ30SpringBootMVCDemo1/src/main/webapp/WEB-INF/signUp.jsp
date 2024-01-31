<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1">

<form action="addCustomer" method="post">
<tr><td>First Name</td><td><input type="text" name="customerName" required="required"></td></tr>
<tr><td>Enter User Name</td><td><input type="text" name="userName" pattern="[0-9]{4}[A-Za-z]{2}[&#@]{1}"></td></tr>
<tr><td>Password</td><td><input type="text" name="userPassword" pattern="[A-Za-z0-9&#]{4}"></td></tr>
<tr><td>Phone</td><td><input type="text" name="phoneNumber" pattern="[6-9]{1}[0-9]{9}"></td></tr>
<tr><td>Email Id</td><td><input type="text" name="emailId" pattern="[a-zA-z0-9]+[@]{1}[A-Za-z]+[.]{1}[a-zA-z]{3}"></td></tr>
<tr><td>Enter city</td><td><input type="text" name="city" pattern="[A-Za-z]{3,20}"></td></tr>
<tr><td>Enter Country</td><td><select name="country" required="required">
<option value="INDIA" >INDIA</option>
<option value="USA" >USA</option>
<option value="RUSSIA" >RUSSIA</option>
  

</select></td></tr>

<tr><td>Enter state</td><td><select name="state" required="required">
<option value="UP">UP</option>
<option value="AP">AP</option>
<option value="WB">WB</option>
<option value="MH">MH</option>
<option value="KA">KA</option>

 </select></td></tr>
<tr><td>Enter pinCode</td><td><input type="text" name="pinCode" required="required"></td></tr>
<tr align="center"><td ><input type="submit" value="SignUp"></td></tr>


</table>
</form>
<center><a href="/">go to home page</a></center>
</body>
</html>