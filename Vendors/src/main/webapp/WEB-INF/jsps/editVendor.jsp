<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateVendor" method="post">
Id:<input type="text" name="id" value="${vendor.id }" readonly><br><br>
Code:<input type="text" name="code" value="${vendor.code}"><br><br>
Name:<input type="text" name="name" value="${vendor.name}"><br><br>
Type:<select name="type">
<option value="REGULAR"  ${vendor.type=='REGULAR'?'selected':''}>Regular</option>
<option value="CONTRACT" ${vendor.type=='CONTRACT'?'selected':''}>Contract</option></select><br><br>
Email:<input type="text" name="email"  value="${vendor.email}"><br><br>
Phone:<input type="text" name="phone"  value="${vendor.phone}"><br><br>
Address:<textarea name="address" >${vendor.address}</textarea><br><br>
<input type="submit" value="save">
</form>
<a href="displayVendor">View All Vendors</a>
</body>
</html>
</html>