<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveVendor" method="post">
Id:<input type="text" name="id"><br><br>
Code:<input type="text" name="code"><br><br>
Name:<input type="text" name="name"><br><br>
Type:<select name="type">
<option value="REGULAR">Regular</option>
<option value="CONTRACT">Contract</option></select><br><br>
Email:<input type="text" name="email"><br><br>
Phone:<input type="text" name="phone"><br><br>
Address:<textarea name="address"></textarea><br><br>
<input type="submit" value="save">
</form>
${msg}
<a href="displayVendor">View All Vendors</a>
</body>
</html>